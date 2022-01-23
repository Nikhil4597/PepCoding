public static void main(String []  args)
{
	Node root= getTree(arr) //preorder to tree transform
//	Node tail = Linear(root);
	show(root);
	
}
public static Node Linear(Node node){
Node ln = node.children.get(node.children.size()-1);
Node tail = Linear(ln);
	while(node.children.size()>1)
	{
		int size = node.children.size();
		Node sln = node.children.get(size-2);
		Node slnt = Linear(sln);
		node.children.remove(size-1);
		node.children.add(ln);
		ln = sln;
}
return tail
}

