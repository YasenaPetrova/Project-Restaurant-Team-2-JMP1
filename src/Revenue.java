public class Revenue {
    private double totalRevenue;
    private double totalTips;

    public Revenue() {
        this.totalRevenue = 0;
        this.totalTips = 0;
    }

    public void addTips(double tips) {
        this.totalTips += tips;

    }

    public void addRevenue(double revenue) {
        this.totalRevenue += revenue;
    }

    public double gerNetRevenue() {
        return this.totalRevenue - this.totalTips;
    }

}


