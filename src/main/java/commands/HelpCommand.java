package commands;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;

/**
 * Команда "Помощь"
 */
public class HelpCommand {
    private Logger logger = LoggerFactory.getLogger(HelpCommand.class);

    public HelpCommand(String identifier, String description) {
        super(identifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
        String userName = Utils.getUserName(user);

        logger.debug(String.format("Пользователь %s. Начато выполнение команды %s", userName,
                this.getCommandIdentifier()));
        sendAnswer(absSender, chat.getId(), this.getCommandIdentifier(), userName,
                "Я бот, который поможет Вашим детям быстро научиться считать в уме\n\n" +
                        "Я сгенерирую word-файл с заданиями, чтобы Вам не пришлось искать или придумывать их. " +
                        "Напечатайте его и попросите Вашего ребёнка решать по одной страничке в день\n\n" +
                        "❗*Список команд*\n" +
                        "/plus - сложение\n" +
                        "/minus - вычитание\n" +
                        "/plusminus - сложение и вычитание\n" +
                        "/multiply - умножение\n" +
                        "/divide - деление\n" +
                        "/multdivide - умножение и деление\n" +
                        "/all - все четыре арифметических действия\n" +
                        "/settings - просмотреть текущие настройки\n" +
                        "/help - помощь\n\n" +
                        "По умолчанию я сформирую *1 страницу* заданий с использованием чисел *от 1 до 15*. Если Вы " +
                        "хотите изменить эти параметры, введите через пробел или запятую 3 числа - минимальное число " +
                        "для использования в заданиях, максимальное число и количество страниц в файле (не более 10)\n" +
                        "\uD83D\uDC49 Например, 3,15,6 или 4 17 3\n\n" +
                        "Не стоит проверять мою работу на числах более 10 000. Программисту было лень их учитывать -" +
                        " ведь я делаю задания для маленьких детей - и Вы просто получите в ответ моё непонимание\n\n" +
                        "Желаю удачи\uD83D\uDE42");
        logger.debug(String.format("Пользователь %s. Завершено выполнение команды %s", userName,
                this.getCommandIdentifier()));
    }
}
