class Main {
  public static void main(String[] args) {
    
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", "broadleaf", true, "red");

    tree1.print();
    tree2.print();

    tree1.setTreeName("Spruce");
    tree1.setTreeType("Conifer");
    tree1.print();

  }
}