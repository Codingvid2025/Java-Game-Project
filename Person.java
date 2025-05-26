package Board;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class Person {
    int[] cards = new int[14];
    public int playerNumber = 0;
    public int loopsMade = 0;
    String name;
    int position = 0;
    public Person(String name) {
        if(playerNumber == 0) {
            Stage gameStage = new Stage();
            gameStage.setTitle("Game Board");

            // Load the FXML file
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/Board-Game-Project/Game.fxml"));
                BorderPane root = loader.load();

                // Get the controller and set user data
                SceneController controller = loader.getController();
                controller.setUserData(username, role);

                // Set the scene
                Scene scene = new Scene(root, 800, 600);
                gameStage.setScene(scene);
                gameStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(playerNumber < 4) {
            this.name = name;
            playerNumber++;
        }
        else{
            System.out.println("The max amount of players has been reached");
        }
    }

    public void setCards(int[] cards) {
        this.cards = cards;
    }
    public int[] getCards() {
        return cards;
    }
    public void loseACard(int[] cards, int numRemovals){
        for(int card:cards){
            if(card != 0 && numRemovals > 0){
                card = 0;
                numRemovals--;
            }
        }
    }
    public void gainACard(int[] cards, int numAdditions){
        Random rand = new Random();
        for(int card:cards){
            if(card == 0 && numAdditions > 0){
                card = rand.nextInt(1,14);
                numAdditions--;

            }
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}