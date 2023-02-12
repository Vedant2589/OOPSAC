class method{
    int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        method obj = new method();
        int c = obj.sum(5,4);
        System.out.println(c);
    }
}