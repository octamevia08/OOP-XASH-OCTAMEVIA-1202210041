class Calculation implements Runnable{
  
    protected double radius=0; 
    protected double side=0; 
    protected double area=0;
    final double phi = 3.14;
  
    void setRadius(double rad)throws IllegalAccessException{
      if (rad<1) {
        throw new IllegalAccessException();
      }
      this.radius=rad;
    }
  
    void setSide(double s)throws IllegalAccessException{
      if (s<1) {
        throw new IllegalAccessException();
      }
      this.side=s;
    }
  
    public void setSquare() {
      this.area = this.side*this.side;
    }
  
    public double getSquare() {
      return this.area;
    }
  
    public void setCircle() {
      this.area = this.phi * (this.radius* this.radius);
    }
  
    public double getCircle() {
     return this.area; 
    }
  
    public void setTripezoid(double a, double b, double t) {
        if (a > 0 && b > 0 && t > 0) {
            this.area = 0.5 * (a + b) * t;
        }
    }
  
    public double getTripezoid() {
     return this.area;
    }
  
    @Override
    public void run() {
      // TODO Auto-generated method stub
      System.out.println("\n====Program will start in====");
      for (int i = 3; i > 0; i--) {
        try {
          System.out.printf("Starting with thread %d \n", i);
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
      }
    }
  }