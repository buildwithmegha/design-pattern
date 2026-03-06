public class Main {

    public static void main(String[] args) {

        Handler support = new SupportExecutive();
        Handler lead = new TeamLead();
        Handler manager = new Manager();

        support.setNextHandler(lead);
        lead.setNextHandler(manager);

        support.handleRequest(600);
        support.handleRequest(200);
        support.handleRequest(100);

    }
}