
先修课程是拓扑排序的经典应用, 这里相当于找有向图是否有环, 如果有环的话拓扑排序能遍历到的节点将少于图的节点. 这里我们建立一个图, 用一个数组记录每个节点的入度. 对图进行拓扑排序