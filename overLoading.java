/*class overLoading{
    int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
        return  a*b;
    }

    public static void main(String[] args) {

        overLoading obj = new overLoading();
        int c = obj.multiply(5,4);
        double d = obj.multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " +  d);

    }
}*/

class overLoading{
    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return  a*b*c;
    }

    public static void main(String[] args) {

        overLoading obj = new overLoading();
        int c = obj.multiply(5,4);
        int d = obj.multiply(5,4,3);
        System.out.println(c);
        System.out.println(d);

    }
}
