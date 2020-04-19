### 作业：

#### 一：用add first或add last这套新的API改写Deque的代码

```
    Deque<String> deque = new LinkedList<>();

    deque.addFirst("a");
    deque.addFirst("b");
    deque.addFirst("c");
    System.out.println(deque);

    String str = deque.getFirst();
    System.out.println(str);
    System.out.println(deque);

    while (deque.size() > 0) {
        System.out.println(deque.removeFirst());
    }
    System.out.println(deque);
```

#### 二：分析Queue和Priority Queue的源码（jdk8）

​	Priority Queue基于堆实现，目前不太懂堆，不做很深入的分析，主要分析入队，出队方法。

##### 1.入队 add和offer（add也是调用的offer）

```
public boolean offer(E e) {
	if (e == null)//不支持null元素
		throw new NullPointerException();
	modCount++;
	int i = size;
	//判断元素个数达到最大容量（用数组来存储元素），就扩容
	if (i >= queue.length)
		grow(i + 1);
	size = i + 1;
	//如果还没有元素，直接插入到数组第一个位置
	if (i == 0)
		queue[0] = e;
	//如果已经有元素，插入数组最后一个位置，然后做自下而上的堆化
	else
		siftUp(i, e);
	return true;
}
```

时间复杂度为O(logn)

##### 2.出队 remove和poll （remove也是调用的poll，加了判断没有元素抛出异常的逻辑）

```
public E poll() {
    // 如果size为0，说明没有元素
    if (size == 0)
        return null;
    // 弹出元素，元素个数减1
    int s = --size;
    modCount++;
    // 队列首元素
    E result = (E) queue[0];
    // 队列末元素
    E x = (E) queue[s];
    // 将队列末元素删除
    queue[s] = null;
    // 如果弹出元素后还有元素
    if (s != 0)
        // 将队列末元素移到队列首
        // 再做自上而下的堆化
        siftDown(0, x);
    // 返回弹出的元素
    return result;
}

```

时间复杂度为O(logn)

### 总结：

1.第一周坚持每日打卡，但是遍数没练够，下周要重复练习，花更多的时间

2.许多数组和链表题用到双指针法解决，这快还需要多加练习

3.遇到不会的题先看题解，然后自己去写，但还是总写错，每次提交去执行报错就会觉得心力憔悴，需要细心，先把逻辑理清楚再去写

4.第4节课的两节课后题现在确实做不出来

Done is better than perfect，自己一定会坚持完成的