学习笔记

### 学习进度：

​	这周学习了深度、广度优先搜索；贪心算法和二分查找。

​	（测试下提交）

##### DFS模板（递归）：

```
visited = set() 

def dfs(node, visited):
    if node in visited: # terminator
    	# already visited 
    	return 

	visited.add(node) 

	# process current node here. 
	...
	for next_node in node.children(): 
		if next_node not in visited: 
			dfs(next_node, visited)
```

##### DFS模板（非递归）：

```
def DFS(self, tree): 

	if tree.root is None: 
		return [] 

	visited, stack = [], [tree.root]

	while stack: 
		node = stack.pop() 
		visited.add(node)

		process (node) 
		nodes = generate_related_nodes(node) 
		stack.push(nodes) 

	# other processing work 
	...
```

##### BFS模板：

```
def BFS(graph, start, end):
    visited = set()
	queue = [] 
	queue.append([start]) 

	while queue: 
		node = queue.pop() 
		visited.add(node)

		process(node) 
		nodes = generate_related_nodes(node) 
		queue.push(nodes)

	# other processing work 
	...
```

##### 二分查找模板：

```
    public int searchRangeFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            //取左中位数
            //同时是查询排序数组第一个位置
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        } 
        return nums[left] == target ? left : -1;
    }

    public int searchRangeEnd(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            //取右中位数
            //同时是查询排序数组最后一个位置
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left =  mid;
            }
        }
        return nums[left] == target ? left : -1;
    }
```

