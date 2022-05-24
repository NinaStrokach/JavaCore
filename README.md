# JavaCore
Course

# JavaCore
Course

## lesson1
**Задание 1 урока**

Разобраться с имеющимся кодом;
Добавить класс Team, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить команду пройти всю полосу; То есть в итоге должно быть:
      
    public static void main(String[] args) {
      
    Course c = new Course(...); // Создаем полосу препятствий

    Team team = new Team(...); // Создаем команду

    c.doIt(team); // Просим команду пройти полосу

    team.showResults(); // Показываем результаты
    }
    
## lesson2
**Задание 2 урока**

1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение ```MyArraySizeException```.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в `int` и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение `MyArrayDataException` с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе `main()` вызвать полученный метод, обработать возможные исключения `MyArraySizeException` и `MyArrayDataException` и вывести результат расчета.

## lesson3
**Задание 3 урока**

1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
2. Задача:
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.
