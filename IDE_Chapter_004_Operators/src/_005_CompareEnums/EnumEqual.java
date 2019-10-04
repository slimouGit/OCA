package _005_CompareEnums;

class EnumEqual {
    enum Color {RED,BLUE};

    public static void main(String[] args){
        Color c1 = Color.RED;
        Color c2 = Color.BLUE;
        Color c3 = Color.RED;
        Color c4 = Color.BLUE;

        if(c1 == c2) System.out.println("==");          //NOT PRINTED OUT
        if(c1.equals(c2)) System.out.println("equal");  //NOT PRINTED OUT

        if(c1 == c3) System.out.println("==");          //PRINTED OUT
        if(c2.equals(c4)) System.out.println("equal");  //PRINTED OUT
    }


}
