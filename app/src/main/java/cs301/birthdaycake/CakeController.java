package cs301.birthdaycake;

public class CakeController {

    private CakeView myCakeView;
    private CakeModel myCakeModel;


        public CakeController(CakeView myCake){
            myCakeView = myCake;
            myCakeModel = myCakeView.getCakeModel();
        }
    }
