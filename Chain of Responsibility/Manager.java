class Manager extends Handler {

    public void handleRequest(int amount) {

        if(amount <= 1000) {
            System.out.println("Handled by Manager");
        }
        else if(nextHandler != null) {
            nextHandler.handleRequest(amount);
        }

    }
}