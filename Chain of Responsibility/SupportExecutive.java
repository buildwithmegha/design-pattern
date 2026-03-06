class SupportExecutive extends Handler {

    public void handleRequest(int amount) {

        if(amount <= 50) {
            System.out.println("Handled by Support Executive");
        }
        else if(nextHandler != null) {
            nextHandler.handleRequest(amount);
        }

    }
}