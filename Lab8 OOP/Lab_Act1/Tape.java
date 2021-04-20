class Audio extends Publication {
    int time;
    public Audio(int a, String b,int time) {
        super(a, b);       
        this.time=time;  
    }

    public Audio(int a, String b) {
        super(a, b);   
    }

    public int getTime() {
        return time;    
    }

    public void setTime(int time) {
        this.time = time;    
    }

    public void display() {
        System.out.println("Audio \nTitle ="+title+" \n price = "+price+" \n time "+time);   
    }
}
