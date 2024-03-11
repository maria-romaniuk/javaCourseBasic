package consultation.consulation15;

public class Request {
    private String text;
    private Integer num;

    public Request(String text, Integer num) {
        this.text = text;
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public Integer getNum() {
        return num;
    }


    public static String checkRequest(Request request){
        if(request.getText().length() <= 10 && request.getNum() >= 100 && request.getNum() <= 550){
            if (request.getText().length() >= 100 && request.getText().length() < 200) {
                return "Запрос получен";
            } else if (request.getText().length() >= 200 && request.getText().length() < 300) {
                return "Ок";
            } else if (request.getText().length() >= 300 && request.getText().length() < 400) {
                return "Сервисный запрос";
            } else if (request.getText().length() >= 400 && request.getText().length() < 500) {
                return "Ошибка пользователя";
            } else if (request.getText().length() >= 500 && request.getText().length() <= 550) {
                return "Ошибка сервера";
            } else {
                return "Ошибка: некорректное значение в запросе";
            }
        }
        return null;
    }

    public static void request(){

    }


    @Override
    public String toString() {
        return "Request{" +
                "text='" + text + '\'' +
                ", num=" + num +
                '}';
    }



}
