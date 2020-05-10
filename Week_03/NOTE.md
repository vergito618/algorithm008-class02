学习笔记

### 这周主要学习的是熟的递归，分治和回溯

#### 递归模板：

```
public void recur(int level, int param) { 
  // 1.terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // 2.process current logic 
  process(level, param); 
  // 3.drill down 
  recur( level: level + 1, newParam); 
  // 4.restore current status 
 
}
```

#### 分治模板:

```
def divide_conquer(problem, param1, param2, ...): 
  # 1.recursion terminator 
  if problem is None: 
	print_result 
	return 

  # 2.prepare data 
  data = prepare_data(problem) 
  subproblems = split_problem(problem, data) 

  # 3.conquer subproblems 
  subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
  subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
  subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
  …

  # 4.process and generate the final result 
  result = process_result(subresult1, subresult2, subresult3, …)
	
  # 5.revert the current level states
```

### 总结：

​		这周学习基本都是递归的解法，之前对递归可以说是一窍不通，感觉写起来很吃力，基本上体都是不会做的，刚开始看题解都看不懂，一道题看了半个多小时题解。。也没看懂
​		后来先记住老师的代码模板，跟着老师的视频做题，多跟几遍，能够自己写出代码，现在课程感觉跟不上了，后面要加油了！

### 作业：

#### 	1.二叉树的最近公共祖先

​	这个看着题解做的，做了两遍，感觉理解的还不是很深

#### 	2.从前序与中序遍历序列构造二叉树

​	这道题看完题解后完全理解常规的解题思路，对树的前序，中序有更深的理解，能够自己做出这道题了