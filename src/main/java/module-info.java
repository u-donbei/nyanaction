module jp.co.yahoo.yu_w_main.nyanaction {
    requires javafx.controls;
    requires javafx.fxml;


    opens jp.co.yahoo.yu_w_main.nyanaction to javafx.fxml;
    exports jp.co.yahoo.yu_w_main.nyanaction;
}