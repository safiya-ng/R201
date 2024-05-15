public class TableauBooleens {
    boolean[] tab ;

    public TableauBooleens (boolean[] t){
        this.tab=t ;
    }

    public TableauBooleens (TableauBooleens tb){
        tab = new boolean[tb.taille()];
        for (int i=0 ; i<tb.taille() ; i++)
            tab[i]=tb.get(i);
    }

    public boolean get(int i) {
        return this.tab[i];
    }

    public void set(int i, boolean val) {
        this.tab[i]=val;
    }

    public int taille() {
        return this.tab.length;
    }

    public TableauBooleens et(TableauBooleens tb) {
        boolean[] res = new boolean[tb.taille()];
        for (int i=0 ; i<this.taille() ; i++)
            res[i]=this.get(i) && tb.get(i);
        return new TableauBooleens(res);
    }

    public boolean et(){
        int i = 0;
        while (i<this.taille() && this.get(i))
            i++;
        return (i==this.taille());
    }

    public String toString() {
        String str="|";
        for (int i=0 ; i<this.taille() ; i++)
            str = str + this.get(i) + "|";
        return str;
    }

    public static void main(String[] args) {
        boolean[] t1 = {false, false, false, false};
        TableauBooleens a=new TableauBooleens(t1);
        System.out.println("a avant : " + a);       // (1)
        t1[0]=true;
        System.out.println("a après : " + a);       // (2)

        TableauBooleens b=new TableauBooleens(a);
        t1[1]=true;
        b.set(2, true);
        System.out.println("a : " + a);             // (3)
        System.out.println("b : " + b);             // (4)

        TableauBooleens c = a.et(b);
        System.out.println("c : " + c);

        boolean[] t2 = {true, true, true, true};
        TableauBooleens d = new TableauBooleens(t2);
        System.out.println("d : " + d);

        System.out.println("et(c) : " + c.et());
        System.out.println("et(d) : " + d.et());
    }
}
