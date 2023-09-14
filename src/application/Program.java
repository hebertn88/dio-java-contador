package application;

import exceptions.InvalidParametersException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro parâmetro: ");
            final int parameterA = sc.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            final int parameterB = sc.nextInt();

            System.out.println();

            validateParameters(parameterA, parameterB);

            count(parameterA, parameterB);

        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido! Digite um número inteiro.");
        }
        finally {
            System.out.println();
            System.out.println("FIM!");
        }
    }

    public static void count(int parameterA, int parameterB) {
        int limit = parameterB - parameterA;
        for (int i=1; i<=limit; i++) {
            System.out.printf("Imprimindo %d\n", i);
        }

    }

    public static void validateParameters(int parameterA, int parameterB) throws InvalidParametersException {
        if (parameterA >= parameterB) {
            throw new InvalidParametersException("O primeiro parâmetro deve ser menor que o segundo! Tente novamente.");
        }
    }
}
