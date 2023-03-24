import java.awt.*;
class MenuExample {
    MenuExample(){
        Frame f= new Frame("NetBeans IDE");
        MenuBar mb=new MenuBar();

        // File Menu
        Menu menu=new Menu("File");
        Menu submenu=new Menu("New");
        MenuItem i1=new MenuItem("New Project");
        MenuItem i2=new MenuItem("New File");
        MenuItem i3=new MenuItem("Open");
        MenuItem i4=new MenuItem("Save");
        MenuItem i5=new MenuItem("Print");

        submenu.add(i1);
        submenu.add(i2);
        menu.add(submenu);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        mb.add(menu);

        // Run Menu
        Menu Run=new Menu("Run");
        MenuItem run=new MenuItem("Run Main");
        MenuItem debug=new MenuItem("Debug");

        Run.add(run);
        Run.add(debug);
        mb.add(Run);

        f.setMenuBar(mb);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new MenuExample();
    }
}