package BusRes;

public class Bus {
   private int busNo;
   private boolean ac;
   private int capacity;
  Bus( int no,boolean ac,int cap)
  {
      this.busNo=no;
      this.ac=ac;
      this.capacity=cap;
  }
  public int getBusNo(){
      return busNo;
  }
  public void setBusNoy(int no){
      busNo=no;
  }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }
    public boolean isAc(){
      return ac;
    }
    public void setAc(boolean val){
      ac=val;
    }
    void displayBusInfo(){
        System.out.println("BusNo:"+ busNo +" Ac:"+ ac + " Total_Capacity:" + capacity);
    }

    }
