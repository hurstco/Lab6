class Tree
{
private String treeName;
private String treeType;
private boolean leavesFall;
private String leafColor;

public Tree()
{
  treeName = "";
  treeType = "";
  leavesFall = false;
  leafColor = "";
}

Tree(String aName, String aType, boolean aleavesFall, String aColor)
{
  treeName = aName;
  treeType = aType;
  leavesFall = aleavesFall;
  leafColor = aColor;
}

String getTreeName()
{
  return treeName;
}

String getTreeType()
{
  return treeType;
}

boolean getLeavesFall()
{
  return leavesFall;
}

String getLeafColor()
{
  return leafColor;
}

void setTreeName(String aName)
{
  treeName = aName;
}

void setTreeType(String aType)
{
  treeType = aType;
}

void setLeafLoss(boolean aleavesFall)
{
  leavesFall = aleavesFall;
}

void setLeafColor(String aColor)
{
  leafColor = aColor;
}

void print()
{
  if(getLeavesFall() == true)
  {
    System.out.println("This is a " + treeName +  " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does lose its leaves for the winter.");
  }

  else
  {
    System.out.println("This is a " + treeName +  " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ".  It does not lose its leaves for the winter.");
  }

  
}


}