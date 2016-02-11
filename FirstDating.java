package ua.com.juja.core;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Yuriy on 10.02.2016.
 */

/*
Программа вопросов для первого свидания
 */

public class FirstDating {
    public static String sex;

    // Главный метод запуска программы
    public static void main(String[] args) throws IOException {

        manWoman();

    }

    // Метода анализа - какой пол у человека,  кто ты  - Мужчина или Женщина?
    public static void manWoman() throws IOException {
        BufferedReader inputSex = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите \"Male\" - если вы мужчина или Введите \"Female\"- если вы женщина!");


        switch (sex = inputSex.readLine()) {
            case "Male":
                System.out.println("Группа вопросов для женщин: ");
                mathRandomFemale();
                break;
            case "Female":
                System.out.println("Группа вопросов для мужчин: ");
                mathRandomMale();
                break;
            default:
                manWoman();
        }

    }

    //Метод выбора случайного числа из заданного диапазона (для мужчин), потом это число подставляется в метод с вопросами.
    public static void mathRandomMale() {
        Random random = new Random();
        int question = random.nextInt(18);
        getQuestionMale(question);
    }
    //Метод выбора случайного числа из заданного диапазона (для женщин), потом это число подставляется в метод с вопросами.
    public static void mathRandomFemale() {
        Random random = new Random();
        int question = random.nextInt(18);
        getQuestionFemale(question);
        //System.out.println(a);
    }

    // Метод с вопросами для мужчин.
    public static void getQuestionMale(int question) {
        switch (question) {
            case 1:
                System.out.println("У тебя есть \"вредные\" привычки?\"");
                break;
            case 2:
                System.out.println("Какой вид спорта тебе интересен?");
                break;
            case 3:
                System.out.println("Что в отношениях между мужчиной и женщиной на твой взгляд является главным?");
                break;
            case 4:
                System.out.println("Какие интересные моменты у тебя были в детсве?");
                break;
            case 5:
                System.out.println("Если бы ты поймал золотую рыбку, то какие три желания ты бы загадал?");
                break;
            case 6:
                System.out.println("Что может сделать тебя счастливым? Что может опечалить?");
                break;
            case 7:
                System.out.println("Любишь ли учиться, есть потребность в познании нового?");
                break;
            case 8:
                System.out.println("Если бы у тебя был миллион долларов, как бы ты им распорядился?");
                break;
            case 9:
                System.out.println("На каком музыкальном инструменте ты бы хотел научиться играть?");
                break;
            case 10:
                System.out.println("Если бы ты мог быть невидимкой, куда бы ты пошел?");
                break;
            case 11:
                System.out.println("Какие три вещи ты бы взял с собой на необитаемый остров?");
                break;
            case 12:
                System.out.println("Как программирование или ИТ сфера пересекается у тебя в жизни?");
                break;
            case 13:
                System.out.println("Какие фильмы тебя нравятся?");
                break;
            case 14:
                System.out.println("Нравится ли тебе путешествовать? Какой вид путешествия тебе ближе? Что больше нравится море, лес, горы?");
                break;
            case 15:
                System.out.println("Любишь ли учиться, есть потребность в познании нового?");
                break;
            case 16:
                System.out.println("У тебя было чувство величайшей свободы?");
                break;
            case 17:
                System.out.println("Как ты относишься к совпадениям?");
                break;

            default:
                System.out.println("Твой вопрос...)))");
                break;
        }
    }
 // Метод с вопросами для женщин.
    public static void getQuestionFemale(int question) {
        switch (question) {
            case 1:
                System.out.println("Как давно ты была в кинотеатре, какие фильмы тебе нравятся?");
                break;
            case 2:
                System.out.println("Какие твои увлечения?");
                break;
            case 3:
                System.out.println("Какие места в нашем городе или может в другом городе, тебе памятны и чем?");
                break;
            case 4:
                System.out.println("У тебя есть \"вредные\" привычки?");
                break;
            case 5:
                System.out.println("Нравится ли тебе путешествовать? Какой вид путешествия тебе ближе? Что больше нравится море, лес, горы?");
                break;
            case 6:
                System.out.println("Любишь ли учиться, есть потребность в познании нового?");
                break;
            case 7:
                System.out.println("Какой вид спорта тебе интересен?");
                break;
            case 8:
                System.out.println("Какие три вещи ты бы взяла с собой на необитаемый остров?");
                break;
            case 9:
                System.out.println("У тебя есть домашние животные? Каких животных ты любишь?");
                break;
            case 10:
                System.out.println("Что тебе приносит самое большое удовольствие?");
                break;
            case 11:
                System.out.println("У тебя было чувство величайшей свободы?");
                break;
            case 12:
                System.out.println("Что в отношениях между мужчиной и женщиной на твой взгляд является главным?");
                break;
            case 13:
                System.out.println("Что может сделать тебя счастливой? Что может опечалить?");
                break;
            case 14:
                System.out.println("Какие интересные моменты у тебя были в детсве?");
                break;
            case 15:
                System.out.println("Если бы ты поймала золотую рыбку, то какие три желания ты бы загадала?");
                break;
            case 16:
                System.out.println("Если бы у тебя был миллион долларов, как бы ты им распорядилась?");
                break;
            case 17:
                System.out.println("Как программирование или ИТ сфера пересекается у тебя в жизни?");
                break;

            default:
                System.out.println("Твой вопрос...)))");
                break;
        }
    }
}
