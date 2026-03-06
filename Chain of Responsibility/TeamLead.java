class TeamLead extends Handler {

    public void handleRequest(int amount) {

        if(amount <= 200) {
            System.out.println("Handled by Team Lead");
        }
        else if(nextHandler != null) {
            nextHandler.handleRequest(amount);
        }

    }
}