package com.company;

/**
 * Created by arun on 4/16/16.
 */
public class SearchTree implements NodeList {

    private ListItems root;

    public SearchTree(ListItems root) {
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return this.root;
    }

    @Override
    public boolean addItems(ListItems items) {
        if (items == null){
            return false;
        } else {
            ListItems root = addNode(this.root,items);
            if (root !=null){
                this.root = root;
                return true;
            }
            return false;
        }
    }
    private ListItems addNode(ListItems root, ListItems items){
        if (root == null){
            root = items;
        } else {
            if (root.compareToListItem(items) < 0) {
                root.setNextOrRight(addNode(root.nextRight(), items));
            } else if(root.compareToListItem(items) == 0) {
                System.out.println("Item Already present in the tree");
                return root;
            } else {
                root.setPreviousOrLeft(addNode(root.previuosLeft(), items));
            }
        }
        return root;
    }

    @Override
    public boolean removeItems(ListItems items) {
        if (items == null){
            return false;
        }
        ListItems root = removeNode(this.root,items);
        if (root !=null){
            this.root = root;
            return true;
        }
        return false;
    }
    private ListItems removeNode(ListItems root, ListItems items){
        if (root == null){
            return root;
        }
        if (root.compareToListItem(items)>0){
            root.setPreviousOrLeft(removeNode(root.previuosLeft(),items));
        } else if(root.compareToListItem(items)<0){
            root.setNextOrRight(removeNode(root.nextRight(),items));
        } else{
            if (root.nextRight() == null){
                return root.previuosLeft();
            } else if(root.previuosLeft() == null){
                return root.nextRight();
            }

            ListItems temp = minValueNode(root.nextRight());
            root.item = temp.item;
            root.setNextOrRight(removeNode(root.nextRight(),temp));
        }
        return root;
    }

    private ListItems minValueNode(ListItems root){
        while (root.previuosLeft() != null){
            root = root.previuosLeft();
        }
        return root;
    }

    @Override
    public boolean traverse(ListItems root) {
        if (root == null){
            System.out.println("Tree is empty");
            return false;
        }else{
            inOrderTraverse(root);
            return true;
        }
    }
    private void inOrderTraverse(ListItems root){
        if (root == null){
            return;
        }
        inOrderTraverse(root.previuosLeft());
        System.out.println("Value: "+ root.item);
        inOrderTraverse(root.nextRight());
    }
}
