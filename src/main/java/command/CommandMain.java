package command;

public class CommandMain {
    public static void main(String[] args) {

        BeerOpen beerOpen = new BeerOpen(new Beer());
        FridayRelax fridayRelax = new FridayRelax(new Beer(), new Fish(), new TV());

        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.setCommand(fridayRelax);
        //commandExecutor.setCommand(beerOpen);
        commandExecutor.executeCommand();

    }
}
