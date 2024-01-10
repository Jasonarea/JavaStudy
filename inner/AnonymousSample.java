package inner;

public class AnonymousSample {
    class MagicButtonListener implements  EventListener {
        @Override
        public void onClick() {
            System.out.println("Magic Button Clicked!!");
        }
    }

    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListenerAnonymous();
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    public void setButtonListenerAnonymous() {
        MagicButton button = new MagicButton();
//        button.setListener(new EventListener() {
//            @Override
//            public void onClick() {
//                System.out.println("Magic Button Clicked!!!");
//            }
//        });

        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked!!!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }
}
