import ArtikYear.ArtikYear; 
import BodyMassIndex.BMIndex;
import Calculator.Calculator;
import ChineseZodiacCalculator.Zodiac;
import FlightTicket.FlightTicketPrice;
import GirilenSayiyaKadarUsluSayi.PowerWork;
import Greengrocery.GreenFruitShopping;
import Horoscope.HoroscopeFinder;
import HypotenusAndAreaCalculate.HypotenuseFinder;
import NumberComparison.Comparison;
import PatikaNotOrtalamasi.GeneralAverageCal;
import PatikaNotOrtalamasiIki.ProgressStatus;
import PriceByTheKdv.SalePriceCal;
import ScannerStudy.UserManager;
import Taximeter.Taximeter;
import ValuesOfCircle.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PowerWork evenNumberFinder = new PowerWork();
        evenNumberFinder.powerCal();


    }

    private static void artikYear() {
        ArtikYear artikYear = new ArtikYear();
        artikYear.artik();
    }

    private static void zodiac() {
        Zodiac zodiac = new Zodiac();
        zodiac.zodiacCal();
    }

    private static void flightTicketPrice() {
        FlightTicketPrice flightTicketPrice = new FlightTicketPrice();
        flightTicketPrice.ticketPrice();
    }

    private static void horoscope() {
        HoroscopeFinder horoscope = new HoroscopeFinder();
        horoscope.finder();
    }

    private static void comparison() {
        Comparison comparison = new Comparison();
        comparison.numberComparison();
    }

    private static void progressStatus() {
        ProgressStatus progressStatus = new ProgressStatus();
        progressStatus.averageCal();
    }
    private static void userManager() {
        UserManager userManager = new UserManager();
        userManager.userLogin();
    }
    private static void calculator() {
        Calculator calculator = new Calculator();
        calculator.calculator();
    }
    private static void greenFruitShopping() {
        GreenFruitShopping greenFruitShopping = new GreenFruitShopping();
        greenFruitShopping.shopping();
    }
    private static void bmIndex() {
        BMIndex bmIndex = new BMIndex();
        bmIndex.bmCal();
    }
    private static void circle() {
        Circle circle = new Circle();
        circle.allMethod();
    }
    private static void taximeter() {
        Taximeter taximeter = new Taximeter();
        taximeter.meter();
    }
    private static void hypotenuseFinder() {
        HypotenuseFinder hypotenuseFinder = new HypotenuseFinder();
        hypotenuseFinder.finder();
    }
    private static void salePriceCal() {
        Scanner scn = new Scanner(System.in);
        SalePriceCal salePriceCal = new SalePriceCal();
        salePriceCal.productPriceCal();
        salePriceCal.productPriceCal();
    }
    private static void generalAverageCal() {
        GeneralAverageCal generalAverageCal = new GeneralAverageCal();
        generalAverageCal.averageCal();
    }
}
