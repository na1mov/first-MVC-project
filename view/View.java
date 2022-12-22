package view;

import model.*;
import controller.Controller;

public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}
