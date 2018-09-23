package chapter04.enumJava;

/**
 * Description:枚举（enum）类型是Java 5新增的特性，
 * 它是一种新的类型，允许用常量来表示特定的数据片断，而且全部都以类型安全的形式来表示。
 * Data：01/01/2018
 * Author: Steven
 */
public enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String name;
    private int index;

    Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        //输出某一枚举的值
        System.out.println(Color.RED.getName());
        System.out.println(Color.RED.getIndex());
        //遍历所有的枚举
        for (Color color : Color.values()) {
            System.out.println(color + "  name: " + color.getName() + "  index: " + color.getIndex());
        }
    }
}
