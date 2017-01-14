package CoolTasks_1.Foot;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Турнирная таблица по футболу
 */
public class FootballTable extends javax.swing.JFrame implements ActionListener {

    //компоненты формы
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton jbtnDisplayTeamInfo;
    private javax.swing.JButton jbtnEPLTable;
    private javax.swing.JButton jbtnMatchResult;
    private javax.swing.JButton jbtnSaveTeamInfo;
    private javax.swing.JButton jbtnSetResult;
    private javax.swing.JLabel jlblAwayTeamCaption;
    private javax.swing.JLabel jlblResultCaption;
    private javax.swing.JLabel jlblEPLTableCaption;
    private javax.swing.JLabel jlblHomeTeamCaption;
    private javax.swing.JLabel jlblMatchResultCaption;
    private javax.swing.JLabel jlblTeamInfoCaption;
    private javax.swing.JList jlstAwayTeam;
    private javax.swing.JList jlstHomeTeam;
    private javax.swing.JTable jtblTeamInfo;
    private javax.swing.JTable jtblEPL;
    private javax.swing.JTextField jtxtMatchResult;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel matchPanel;
    private javax.swing.JScrollPane spAway;
    private javax.swing.JScrollPane spEPLTable;
    private javax.swing.JScrollPane spHome;
    private javax.swing.JScrollPane spTeamInfo;
    private javax.swing.JPanel tablePanel;
    //модели для таблиц и списков (подробнее о модели можно почитать в MVC)
    private DefaultTableModel teamInfoModel, eplTableModel;
    private DefaultListModel homeTeamModel, awayTeamModel;
    //константы для панелей
    private final String INFO = "infoPanel";
    private final String TABLE = "tablePanel";
    private final String MATCH = "matchPanel";
    //путь к файлу (может находиться в папке c программой, тогда просто нужно указать имя файла)
    private final String FILEPATH = "C:\\Users\\Ярослав\\WorkID\\Other\\CoolTasks_1\\Football\\premiership.txt";
    //типизированный список (коллекция)
    ArrayList<TeamSummary> teams = new ArrayList<TeamSummary>();

    //метод main -отсюда начинается выполнение программы
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FootballTable().setVisible(true);
            }
        });
    }

    //коструктор
    public FootballTable() {
        //создание графич.компонентов
        initComponents();

        //загрузка данных из файла
        loadFile(FILEPATH);

        //заполнение таблиц
        populateInfoTable();
        populateEPLTable();

        //заполнение листов
        populateLists();

    }

    // <editor-fold defaultstate="collapsed" desc="создание компонентов">
    private void initComponents() {

        //панели
        mainPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JPanel();
        matchPanel = new javax.swing.JPanel();

        mainPanel.setBackground(new java.awt.Color(238, 232, 231));
        infoPanel.setBackground(new java.awt.Color(204, 204, 255));
        tablePanel.setBackground(new java.awt.Color(204, 235, 204));
        matchPanel.setBackground(new java.awt.Color(196, 215, 255));

        mainPanel.setLayout(new CardLayout());
        mainPanel.add(infoPanel, INFO);
        mainPanel.add(tablePanel, TABLE);
        mainPanel.add(matchPanel, MATCH);


        //метки
        jlblTeamInfoCaption = new javax.swing.JLabel("Информация о командах");
        jlblEPLTableCaption = new javax.swing.JLabel("Таблица результатов");
        jlblMatchResultCaption = new javax.swing.JLabel("Результат матча");
        jlblHomeTeamCaption = new javax.swing.JLabel("Выберите первую команду");
        jlblAwayTeamCaption = new javax.swing.JLabel("Выберите вторую команду");
        jlblResultCaption = new javax.swing.JLabel("Результаты матча (голы:голы)");

        jlblTeamInfoCaption.setFont(new java.awt.Font("Arial Black", 1, 18));
        jlblTeamInfoCaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlblEPLTableCaption.setFont(new java.awt.Font("Arial Black", 1, 18));
        jlblEPLTableCaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlblMatchResultCaption.setFont(new java.awt.Font("Arial Black", 1, 18));
        jlblMatchResultCaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlblHomeTeamCaption.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlblAwayTeamCaption.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlblResultCaption.setFont(new java.awt.Font("Tahoma", 1, 11));


        //текстовое поле
        jtxtMatchResult = new javax.swing.JTextField();

        //кнопки
        jbtnDisplayTeamInfo = new javax.swing.JButton("Информация о команде");
        jbtnEPLTable = new javax.swing.JButton("Таблица");
        jbtnMatchResult = new javax.swing.JButton("Результаты");
        jbtnSaveTeamInfo = new javax.swing.JButton("Сохранить в файл");
        jbtnSetResult = new javax.swing.JButton("Записать результат");
        jbtnDisplayTeamInfo.addActionListener(this);
        jbtnEPLTable.addActionListener(this);
        jbtnMatchResult.addActionListener(this);
        jbtnSaveTeamInfo.addActionListener(this);
        jbtnSetResult.addActionListener(this);

        //таблицы

        //модели для таблиц - чтобы изменять данные (подробнее можно прочитать в MVC)
        teamInfoModel = new DefaultTableModel();
        eplTableModel = new DefaultTableModel();

        //установить модели для таблиц
        jtblTeamInfo = new javax.swing.JTable(teamInfoModel);
        jtblEPL = new javax.swing.JTable(eplTableModel);



        //списки

        //модели для списков
        homeTeamModel = new DefaultListModel();
        awayTeamModel = new DefaultListModel();

        //установить модели для списков
        jlstHomeTeam = new javax.swing.JList(homeTeamModel);
        jlstAwayTeam = new javax.swing.JList(awayTeamModel);




        //панели прокрутки
        spTeamInfo = new javax.swing.JScrollPane();
        spEPLTable = new javax.swing.JScrollPane();
        spHome = new javax.swing.JScrollPane();
        spAway = new javax.swing.JScrollPane();
        spTeamInfo.setViewportView(jtblTeamInfo);
        spEPLTable.setViewportView(jtblEPL);
        spHome.setViewportView(jlstHomeTeam);
        spAway.setViewportView(jlstAwayTeam);


        /*
         * панель с информацией о командах
         */
        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
                infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(infoPanelLayout.createSequentialGroup().addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(infoPanelLayout.createSequentialGroup().addGap(26, 26, 26).addComponent(spTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(infoPanelLayout.createSequentialGroup().addGap(110, 110, 110).addComponent(jlblTeamInfoCaption))).addContainerGap(23, Short.MAX_VALUE)));
        infoPanelLayout.setVerticalGroup(
                infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(infoPanelLayout.createSequentialGroup().addGap(13, 13, 13).addComponent(jlblTeamInfoCaption).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(spTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(19, Short.MAX_VALUE)));

        /*
         * турнирная таблица
         */
        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(tablePanelLayout.createSequentialGroup().addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(tablePanelLayout.createSequentialGroup().addGap(26, 26, 26).addComponent(spEPLTable, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(tablePanelLayout.createSequentialGroup().addGap(128, 128, 128).addComponent(jlblEPLTableCaption))).addContainerGap(29, Short.MAX_VALUE)));
        tablePanelLayout.setVerticalGroup(
                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(tablePanelLayout.createSequentialGroup().addGap(13, 13, 13).addComponent(jlblEPLTableCaption).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(spEPLTable, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(19, Short.MAX_VALUE)));




        /*
         * панель для ввода результатов матча
         */

        javax.swing.GroupLayout matchPanelLayout = new javax.swing.GroupLayout(matchPanel);
        matchPanel.setLayout(matchPanelLayout);
        matchPanelLayout.setHorizontalGroup(
                matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(matchPanelLayout.createSequentialGroup().addGap(31, 31, 31).addGroup(matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jlblHomeTeamCaption).addComponent(spHome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jlblResultCaption, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(matchPanelLayout.createSequentialGroup().addComponent(spAway, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()).addGroup(matchPanelLayout.createSequentialGroup().addGroup(matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(matchPanelLayout.createSequentialGroup().addComponent(jtxtMatchResult, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jbtnSetResult)).addComponent(jlblAwayTeamCaption, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)).addContainerGap()))).addGroup(matchPanelLayout.createSequentialGroup().addGap(157, 157, 157).addComponent(jlblMatchResultCaption).addContainerGap(166, Short.MAX_VALUE)));
        matchPanelLayout.setVerticalGroup(
                matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(matchPanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(jlblMatchResultCaption).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jlblHomeTeamCaption).addComponent(jlblAwayTeamCaption)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(spHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(spAway, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(9, 9, 9).addGroup(matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jlblResultCaption).addComponent(jtxtMatchResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jbtnSetResult)).addContainerGap(192, Short.MAX_VALUE)));


        /*
         * менеджер расположения для главной панели фрейма
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jbtnDisplayTeamInfo).addGap(18, 18, 18).addComponent(jbtnEPLTable).addGap(18, 18, 18).addComponent(jbtnMatchResult).addGap(18, 18, 18).addComponent(jbtnSaveTeamInfo).addGap(37, 37, 37)).addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jbtnDisplayTeamInfo).addComponent(jbtnEPLTable).addComponent(jbtnMatchResult).addComponent(jbtnSaveTeamInfo)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)));

        //свойства фрейма
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Чемпионат по футболу");
        setResizable(false);
        setLocation(200, 200); // показать фрейм по этим координатам
        pack();
    }// </editor-fold>

    //определение нажатой кнопки
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnDisplayTeamInfo) {
            //показать информацию о команде
            displayCard(INFO);
        } else if (e.getSource() == jbtnEPLTable) {
            //показать турнирную таблицу
            displayCard(TABLE);
        } else if (e.getSource() == jbtnMatchResult) {
            //показать панель для ввода результатов матча
            displayCard(MATCH);
        } else if (e.getSource() == jbtnSaveTeamInfo) {
            // сохранить таблицу в файл
            saveFile(FILEPATH);
        } else if (e.getSource() == jbtnSetResult) {
            // сохранить результаты в таблицу
            processMatchResult();
        }


    }

    //показ нужной панели
    private void displayCard(String cardName) {
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, cardName);
    }

    //заполнение списка команд
    private void populateLists() {

        String team;// хранит название команды

        //очищаем все данные в модели
        homeTeamModel.clear();
        awayTeamModel.clear();

        //пройти по циклу и заполняем имена команд
        for (int i = 0; i < teams.size(); i++) {

            team = teams.get(i).getTeamName();

            homeTeamModel.addElement(team);
            awayTeamModel.addElement(team);
        }
    }

    //заполнение турнирной таблицы
    private void populateInfoTable() {

        String team;
        int played;
        int scored;
        int conceded;
        int points;

        //если нет столбцов - то добавить их
        if (teamInfoModel.getColumnCount() == 0) {
            //add columns
            teamInfoModel.addColumn("Команда");
            teamInfoModel.addColumn("Игры");
            teamInfoModel.addColumn("Голы");
            teamInfoModel.addColumn("Поражения");
            teamInfoModel.addColumn("Очки");
        }

        //очистить все данные таблицы
        if (teamInfoModel.getRowCount() > 0) {
            for (int i = teamInfoModel.getRowCount() - 1; i >= 0; i--) {
                teamInfoModel.removeRow(i);
            }
        }

        //создание строк с командами
        for (int i = 0; i < teams.size(); i++) {

            //получить значения
            team = teams.get(i).getTeamName();
            played = teams.get(i).getGamesPlayed();
            scored = teams.get(i).getGoalsScored();
            conceded = teams.get(i).getGoalsConceded();
            points = teams.get(i).getPoints();

            //добавляем в модель новую строку
            teamInfoModel.addRow(new Object[]{team, played, scored, conceded, points});
        }

    }

    //заполнение турнирной таблицы
    private void populateEPLTable() {

        //сортировка списка
        ArrayList<TeamSummary> sortedTeams = getSortedTeams();

        int position;
        String team;
        int played;
        int goalsDifference;
        int points;

        //если нет столбцов
        if (eplTableModel.getColumnCount() == 0) {
            //добавить столбцы
            eplTableModel.addColumn("Позиция");
            eplTableModel.addColumn("Команда");
            eplTableModel.addColumn("Игры");
            eplTableModel.addColumn("Разница голов");
            eplTableModel.addColumn("Очки");
        }

        //если есть какие то данные
        if (eplTableModel.getRowCount() > 0) {
            //удалить их
            for (int i = eplTableModel.getRowCount() - 1; i >= 0; i--) {
                eplTableModel.removeRow(i);
            }
        }

        //заполнить таблицу данными из списка
        for (int i = 0; i < sortedTeams.size(); i++) {

            //получить данные полей
            position = i + 1;
            team = sortedTeams.get(i).getTeamName();
            played = sortedTeams.get(i).getGamesPlayed();
            goalsDifference = sortedTeams.get(i).getGoalDifference();

            points = sortedTeams.get(i).getPoints();

            //добавление строки через модель
            eplTableModel.addRow(new Object[]{position, team, played, goalsDifference, points});
        }
    }

    //сортировка списка
    public ArrayList<TeamSummary> getSortedTeams() {
        //создать копию
        ArrayList<TeamSummary> copy = new ArrayList<TeamSummary>();

        //скопировать все команду в копию
        TeamSummary objTeam = null;
        for (int i = 0; i < teams.size(); i++) {
            objTeam = teams.get(i);
            copy.add(objTeam);
        }

        //соритировка
        Collections.sort(copy, Collections.reverseOrder());


        //возвратить отсортированный список
        return copy;
    }

    //добавление результата матча
    private void processMatchResult() {
        //получить индексы выбранных команд
        int homeTeamIndex = jlstHomeTeam.getSelectedIndex();
        int awayTeamIndex = jlstAwayTeam.getSelectedIndex();

        //получить введенный результат матча
        String matchResult = jtxtMatchResult.getText().trim();

        //если не выбрана первая команда
        if (homeTeamIndex == -1) {
            JOptionPane.showMessageDialog(this, "Выберите первую команду", "Ошибка", JOptionPane.WARNING_MESSAGE);

            //если не выбрана вторая команда
        } else if (awayTeamIndex == -1) {
            JOptionPane.showMessageDialog(this, "Выберите вторую команду", "Ошибка", JOptionPane.WARNING_MESSAGE);

            //если не выбрана одна и та же команда
        } else if (homeTeamIndex == awayTeamIndex) {
            JOptionPane.showMessageDialog(this, "Команды должны быть разными", "Ошибка", JOptionPane.WARNING_MESSAGE);

            //если не введен результат
        } else if (matchResult.length() < 3) {
            JOptionPane.showMessageDialog(this, "\n\nВведите результаты матча в формате H:A\nH - голы, забитые первой командой, A - второй", "Ошибка", JOptionPane.WARNING_MESSAGE);

            //если все нормально - считаем голы, очки и пр.
        } else {


            try {
                //получить голы
                int homeGoals = Integer.parseInt(matchResult.split(":")[0]);
                int awayGoals = Integer.parseInt(matchResult.split(":")[1]);

                //записать результат для первой команды
                teams.get(homeTeamIndex).processMatch(homeGoals, awayGoals);

                //записать результат для второй команды
                teams.get(awayTeamIndex).processMatch(awayGoals, homeGoals);

                //обновить таблицы
                populateInfoTable();
                populateEPLTable();

                //сообщение пользователю
                String homeTeam = teams.get(homeTeamIndex).getTeamName();
                String awayTeam = teams.get(awayTeamIndex).getTeamName();
                String message = String.format("Результат успешно добавлен:%n%20s %d%n%20s %d", homeTeam, homeGoals, awayTeam, awayGoals);
                JOptionPane.showMessageDialog(this, message, "Результат матча", JOptionPane.INFORMATION_MESSAGE);

                //ошибка NumberFormatException
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage() + "\n\nВведите результаты матча в формате H:A\nH - голы, забитые первой командой, A - второй", "Ошибка", JOptionPane.WARNING_MESSAGE);
                //другие ошибки
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage() + "\n\nВведите результаты матча в формате H:A\nH - голы, забитые первой командой, A - второй", "Ошибка", JOptionPane.WARNING_MESSAGE);
            }

        }

    }

    //загрузка данных из файла в список
    private void loadFile(String filePath) {

        // определяем файл
        File file = new File(filePath);

        //объекты для считывания файла
        FileReader inputStream = null;
        BufferedReader inputBuffer = null;
        Scanner inputScanner = null;

        String line = "";

        String team;
        int played;
        int scored;
        int conceded;
        int points;


        //если файл существует
        if (file.exists()) {

            // работа с файлами - всегда в блоке try-catch
            try {
                //объекты для считывания данных из файла
                inputStream = new FileReader(file);

                inputBuffer = new BufferedReader(inputStream);

                inputScanner = new Scanner(inputBuffer);

                // считать все строки
                while (inputScanner.hasNextLine()) {
                    //считывать построчно
                    line = inputScanner.nextLine();

                    //парсинг строки на поля
                    team = line.split(";")[0];
                    played = Integer.parseInt(line.split(";")[1]);
                    scored = Integer.parseInt(line.split(";")[2]);
                    conceded = Integer.parseInt(line.split(";")[3]);
                    points = Integer.parseInt(line.split(";")[4]);

                    //создание объекта и добавление в список
                    teams.add(new TeamSummary(team, played, scored, conceded, points));
                }

                //закрыть сканер, буфер и поток
                inputScanner.close();
                inputBuffer.close();
                inputStream.close();

                //ошибка ввода вывода
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Ошибка ввода/вывода", JOptionPane.WARNING_MESSAGE);

                // все остальные ошибки
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Ошибка", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            //ошибка "Файл не существует"
            JOptionPane.showMessageDialog(this, "Файл не существует:\n" + filePath, "Ошибка", JOptionPane.WARNING_MESSAGE);
        }

    }

    //сохранение списка в файл
    private void saveFile(String filePath) {
        //объекты для записи в файл
        FileWriter outputStream = null;
        BufferedWriter outputBuffer = null;
        PrintWriter outputPrinter = null;

        String team;
        int played;
        int scored;
        int conceded;
        int points;

        // работа с файлами - всегда в блоке try-catch
        try {

            // поток для записи в файл
            outputStream = new FileWriter(filePath, false);

            // рекомендуется использовать буфер для записи
            outputBuffer = new BufferedWriter(outputStream);
            outputPrinter = new PrintWriter(outputBuffer);

            //цикл по командам
            for (int i = 0; i < teams.size(); i++) {

                //получить значения
                team = teams.get(i).getTeamName();
                played = teams.get(i).getGamesPlayed();
                scored = teams.get(i).getGoalsScored();
                conceded = teams.get(i).getGoalsConceded();
                points = teams.get(i).getPoints();

                //если это не первая строка - поставить пустуб строку
                if (i > 0) {
                    outputPrinter.println();
                }

                //запись данных в файл
                outputPrinter.print(team + ";" + played + ";" + scored + ";" + conceded + ";" + points);
            }

            //pfrhsnm printer, buffer и stream
            outputPrinter.close();
            outputBuffer.close();
            outputStream.close();

            //перехват ошибки IOException
        } catch (IOException e) {
            //warn user
            JOptionPane.showMessageDialog(this, e.getMessage(), "Output file error", JOptionPane.WARNING_MESSAGE);

            //перехват остальных ошибок
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }
}
