public class MethodOverloading {

    private String x1;
    private String x2;
    private String x3;
    private String x4;


    public MethodOverloading(String x1) {
        this.x1 = x1;
    }

    public MethodOverloading(String x1, String x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public MethodOverloading(String x1, String x2, String x3, String x4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }


    public void getValues(){
        System.out.println();
    }

    public void getValues(int a){
        System.out.println();
    }

    public void getValues(float a){
        System.out.println();
    }
    public void getValues(int a, float b){
        System.out.println();
    }
}
