package Simulation;
import Animals.Herbivore;
import Animals.Carnivore;

import java.util.Random;

    public class ProbabilityOfEatingr {
        private static final Random RANDOM = new Random();

        /**
         * Проверяет, произошло ли событие с заданной вероятностью.
         *
         * @param probability Вероятность события в процентах (например, 60 означает 60%).
         * @return true, если событие произошло, иначе false.
         */
        public boolean checkProbability(int probability) {
            int randomValue = RANDOM.nextInt(100) + 1; // Генерируем случайное число от 1 до 100
            return randomValue <= probability;
        }

        /**
         * Метод, определяющий, произошло ли поедание одного животного другим.
         *
         * @param predator   Хищник (в данном случае Волк)
         * @param prey       Жертва (в данном случае Кролик)
         * @param probability Вероятность поедания в процентах
         * @return true, если хищник съел жертву, иначе false.
         */
        public boolean tryToEat(Carnivore predator, Herbivore prey, int probability) {
            if (checkProbability(probability)) {
                return true;
            } else {
                return false;
            }
        }
    }