# Java 語法

Every line of code that runs in Java must be inside a class.

在Java中每一行程式碼都必須在一個類別當中。類別的開頭必需是大寫
Java的檔案名稱必須與類別名稱相同。類別名稱為Main，檔案名稱就是Main副檔名為.java


## The main() Method

每一個Java程式碼當中都會有一個 main() method
在 main() method 當中的所有程式碼都會執行。

```
public static void main(String[] args)
```

## System.out.println()

在main() method當中，執行println() method 印出文字。

```
public static void main(String[] args) {
    System.out.println("印出文字");
}
```

**{} 是用來標記程式碼的區塊的開始與結束**

# Java Output / Print

## Print Text

使用 println() method 印出文本
使用多個 println() 會將每一個方法添加新的一行

```
System.out.println("Hello");
System.out.println("World");

// Hello
// World
```

### Double Quotes

文字必須寫在雙引號 "" 中，不然會發生錯誤。

```
System.out.println(Hello World);

// error: cannot find symbol 編譯錯誤
```

### The Print() Method

print() method 與 println() method 同樣都是將印出文本
不同在於多個 print() method 會接續印出文本，不會像 println() method 每一個方法都會產生新的一行。

```
System.out.print("Hello ");
System.out.print("World");

// Hello World
```

## Print Numbers

使用 println() method 印出數字。
也可以在println() method 當中進行數學運算

```
public class Main {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10 + 10);
        System.out.println(10 * 3);
    }
}

```

# Java Comments

註解Java程式碼的方法

### Single-line Comments

當行註解使用 // 開頭到行尾都會被Java省略

```
// 這是註解
public class Main {
    public static void main(String[] args) {
        // 這是註解
        System.out.println("Hello");
    }
}
```

### Java Multi-line Comments

多行註解使用 /* 開頭 */ 結尾 其中的內容都會被Java省略

```
public class Main {
    public static void main(String[] args) {
        /* 這是註解 這是註解
        這是註解 這是註解
        */
        System.out.println("Hello");
    }
}
```

# Java Variables

變數是用來儲存資料的容器
在Java當中有不同類型的變數，

- String - 儲存字串，字串值必須使用雙引號包起來
- int - 儲存整數，不包含小數
- float - 儲存帶小數值的浮點數，e.g.:: 19.99
- char - 儲存單一字串，e.g.:: 'a', 'B'，char值是使用單引號包起來
- boolean - 儲存兩種狀態的值，true or false

## Declaring Variables

要在Java當中建立變數，必需要指定變數的儲存類型並賦予變數值。

```
// 類型 變數名稱 = 變數值;
type variableName = value;
```

宣告一個變數類型為 String, 變數名稱為 name, 變數值為 "John"

```
public class Main {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name); // John
    }
}
```

變數是可以重新賦值的，如果想要避免被重新賦值，需要在最前面加上 final
若重新賦值則會出現錯誤。

```
public class Main {
    public static void main(String[] args) {
        final int myNum = 10;
        myNum = 20; // cannot assign a value to final variable myNum
        System.out.println(myNum);
    }
}
```

e.g.: 額外宣告變數的示例

```
float myFloat = 5.99f;
char myChar = 'B';
boolean myBool = true;
```

## Declaring Many Variables

宣告相同類別但不同變數時可以使用,分隔 一行宣告

```
public class Main {
    public static void main(String[] args) {
        // 一般宣告變數方法 x,y,z 各別宣告
        int x = 5;
        int y = 6;
        int z = 50;
        /* 
        當x,y,z的類別都相同時 可以單行使用,分隔宣告
        int x = 5, y = 6, z = 50; 
        */
        System.out.println(x + y + z);
    }
}
```

宣告相同類別，不同變數，但是值是相同時可以使用,分隔 一行宣告

```
public class Main {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);
    }
}
```

# Java Print Variables

列印變數一樣是使用 println() method
如果需要組合文字或變數則可以直接使用 + 運算符

```
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String a = "Hello ";
        System.out.println(x + y); // 30
        System.out.println(a + "World"); // Hello World
    }
}
```

# Java Identifiers

所有Java變數必需使用唯一的名稱來進行標識 稱為 identifiers
唯一標識符可以是短名稱像是x或描述清楚的名稱像是age

**建議使用具描述性的名稱來命名，以便後續在維護上的方便**

```
// 易於理解
int age = 60;

// 簡單但卻不易於理解在做什麼
int m = 60;
```

### 命名變數的規則遵照

- 變數名稱可以包含字母、數字、底線、美元符號
- 變數名稱必須以字母開頭
- 變數名稱比須以小寫字母開頭，不能包含空格
- 變數名稱可以以 $ 和 _ 開頭
- 變數名稱區分大小寫
- 保留字不能作為變數名稱


# Java Data Types

在Java中，宣告變數必需事先指定變數的資料類型。

e.g.:
```
int myNum = 5;
float myFloatNum = 5.99f;
String myText = "Hello";
boolean myBool = true;
```

### 資料類型分為兩種

- 原始資料類型 - byte, short, int, long, float, double, boolean, char
- 非原始資料類型 - String, Array, Classes

## Primitive Data Types

原始資料類型指定變數值的大小以及類型。

| 資料類型 | 大小    | 說明 |
|---------|---------|-----|
| byte    | 1 bytes | 儲存整數 -128 to 127 |
| short   | 2 bytes | 儲存整數 -32,768 to 32767 |
| int     | 4 bytes | 儲存整數 -2,147,483,648 to 2,147,483,647|
| long    | 8 bytes | 儲存整數 -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float   | 4 bytes | 儲存小數 6 ~ 7位10進制數字 |
| double  | 8 bytes | 儲存小數 15位10進制數字|
| boolean | 1 bit   | 儲存 true or false |
| char    | 2 bytes | 儲存單一字元/字母 or ASCII 值  |

e.g.:
```
public class Main {
    public static void main(String[] args) {
        byte num = 128; // byte的儲存整數的範圍是 -128 ~ 127 這裡超出會報錯
        // error: incompatible types: possible lossy conversion from int to byte
    }
}
```

## Numbers Data

原始數字資料分兩種

- Integer types : 整數類型，儲存整數(正整數 or 負整數),不包含小數; 適用類型byte, short, int, long.
- Floating point types : 小數類型，包含一位或多個小數; 適用類型float, double.

### Integer Types (整數類型)

1. byte
當確定要儲存的整數位在 -128 to 127 之間 則可以使用 byte 來宣告變數節省記憶體。

2. short
當儲存的整數確定位在 -32768 to 32767 之間

3. int
當儲存的整數確定位在 -2147483648 to 2147483647 之間

4. long
當儲存的整數確定位在 -9223372036854775808 to 9223372036854775807 之間，在使用long賦值給變數時必需在最尾加上L

```
byte myNum = 100;
int myNum1 = 100000;
long myNumL = 1500000000L;
```

### Float Point Types (浮點類型)

當需要帶小數的數字時則需要使用浮點類型，如: 19.99, 3.1415

**float and double都可以儲存小數，float需以f結尾, double則以d結尾**

```
// Float
float myFloatNum = 5.75f;

// Double
double myDoubleNum = 19.99d;
```

應該使用 float or double?

浮點數的精確度表示小數點後可以有多少位。float精確度約6、7位，double精確度約為15位
對於計算來說使用double比較安全。因為可以計算到小數點後約15位的數字

```
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
```

## Boolean Data

在程式設計中，會需要一種具有兩種值之一的資料類型。

如:
- YES / NO
- ON / OFF
- True / False

在Java中就有特別只用來宣告 true or false 之一的變數類型

```
boolean isJavaFun = true;
boolean isJavaNotFun = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isJavaNotFun);  // Outputs false
```

## Characters Data

### Characters 

char 用來儲存單一字元/字母，必需使用單引號括號起來。 e.g.: 'A'

```
char myChar = 'A';
```

如果熟悉 [ASCII](https://www.w3schools.com/charsets/ref_html_ascii.asp)值，可以用它來顯示數值。

```
char myVal = 65;
System.out.println(myVal); // A
```

### Strings

String 用來儲存字串，必需使用雙引號括號起來。 e.g.: "A"

```
Srting myStr = "A";
System.out.println(myStr);
```

## Non-Primitive Data 

非原始資料稱為引用類型，因為他們指的是對象。

原始資料 與 非原始資料 差別在於

- 原始資料型別是Java已經預先定義，非原始類型則是由程式設計師定義(String除外)
- 非原始可以用於呼叫方法來執行。原始則不行
- 原始資料型別總是有一個值，非原始則可以是 null。
- 原始類型以小寫字母開頭，非原始類型則以大寫字母開頭

# Java Type Casting

## Type Casting

資料類型轉換，將原始資料類型的值指派給另一種類型
在Java中有兩種類型的轉換。

* Widening Casting (自動)
> byte -> short -> char -> int -> long -> float -> double
自動將較小類型轉換為較大類型

```
public class Main {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // int比較小所以在轉換成比較大的double不用手動轉換

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}
```

* Narrowing Casting (手動)
> double -> float -> long -> int -> char -> short -> byte
手動將較大類型轉換為較小類型

```
public class Main {
    public static void main(String[] args) {
        double myDouble = 9.88d;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);    
    }
}
```

## Real-Life 實際上應用

```
public class Main {
    public static void main(String[] args) {
        int maxScore = 500;
        int userScore = 423;

        /*為了確保所得出的值是浮點數而非整數 所以必需要手動轉換類型
        因為是從較大類型轉換為較小類型 所以必需將要轉換的類型用()括號在值的前方*/
        float percentage = (float) userScore / maxScore * 100.0f; // 轉換為百分比最後乘100

        System.out.println(percentage); // 84.6
    }
}
```

# Java Operators

Java運算子用於對變數和值執行操作，如 + operator 用於將two value相加

```
int num = 10 + 20;

int sum1 = 100 + 50;
int sum2 = sum1 + 150; // 300 (150 + 150)
```

- 算術運算符
- 賦值運算符
- 比較運算符
- 邏輯運算符
- 位元運算符

## Arithmetic (算術)

加減乘除 + , - , * , /取商

| 運算符 | 說明 | example |
|----| ----- | ----- |
| %  | 取餘數 |  x % y |
| ++ | 將變數的值加1| ++x |
| -- | 將變數的值減1| --x |

## Assignment (賦值)

用於給變數賦值。在 = 右手邊的數值賦予給左手邊的變數。

```
int x = 10; // 將10這個值賦值給x這個變數
```

賦值可以與算術做結合

```
// 一般 在宣告變數的同時賦值並做算術運算
public class Main {
    public static void main(String[] args) {
        int num = 5;
        num = num + 3;
        System.out.println(num);  // 8
    }
}

// 簡寫 並有同樣結果的寫法
public class Main {
    public static void main(String[] args) {
        int num = 5;
        num += 3;
        System.out.println(num);  // 8
    }
}
```

## Comparison (比較)

比較兩個值(或變數)後回傳布林值，true or false。

```
int x = 5;
int y = 3;
System.out.println(x > y); // 5 大於 3 為真 return true 
```

**單個等號是賦值 兩個等號就是比較運算中的等於**

```
int x = 10;
int y = 10;
System.out.println( x == y); // true
```

## Logical (邏輯)

使用邏輯運算來測試值(或變數)之間的 true or false

- && - and 邏輯 兩邊都必須為真才會回傳true
- || - or  邏輯 只要有一邊為真就會回傳 true
- !  - not 邏輯 取得相反結果

因短路求值特性（short-circuit evaluation）

**&& 當第一個判斷為false後面就不判斷 提升效能**
**|| 當第一個判斷為true後面就不判斷 提升效能**

```
public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println(x > 0 && y > 5); // true
    }
}
```

# Java Strings

使用雙引號括號起來的

## Length (長度)

length 方法是用來計算字串長度

```
public class Main {
    public static void main(String[] args) {
        String greeting = "ABCDEFGH";
        System.out.println(greeting.length());
    }
}
```

## More Methods

如:轉換大小寫
toUpperCase()、toLowerCase()

```
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```

## Finding a Character in a String

搜尋字串中第一次出現的指定文字(包括空白)的索引值
字串的索引值由0開始

```
public class Main {
    public static void main(String[] args) {
        String txt = "ABCDE";
        System.out.println(txt.indexOf("C")); // 2
    }
}
```

### String Concatenation (字串串聯)

1. 加法運算符
```
public class Main {
    public static void main(String[] args) {
        String txt1 = "Hello";
        String txt2 = "World!!";
        System.out.println(txt1 + txt2);       // HelloWorld!!
        System.out.println(txt1 + " " + txt2); // Hello World!!
    }
}
```

2. concat() method 
```
public class Main {
    public static void main(String[] args) {
        String txt1 = "ABC";
        String txt2 = "DEF";
        System.out.println(txt1.concat(txt2)); // ABCDEF
    }
}
```

## Number and String

數字與字串相加會自動將數字轉文字

```
public class Main {
    public static void main(String[] args) {
        String txt = "AB";
        int num = 10;
        System.out.println(txt + num); // AB10
    }
}
```

## Special Characters

因為字串必須寫再雙引號內，所以如果再在字串中加上雙引號Java會出錯

Error: 
- String txt = "ABCACS "C"."

solution:
使用反斜線將特殊字元轉譯成字串字元

1. 轉譯字符 \' 代表字串字元 '
2. 轉譯字符 \" 代表字串字元 "
3. 轉譯字符 \\ 代表字串字元 \

```
public class Main {
    public static void main(String[] args) {
        String txt = "Hello \"World\".";
        System.out.println(txt);
    }
}
```

# Java Math

## Math.max(x,y)

取得兩數中的最大值

## Math.min(x,y)

取得兩數中的最小值

```
public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(Math.max(x, y)); // 10
        System.out.println(Math.min(x, y)); // 5
    }
}
```

## Math.sqrt(x)

平方根函數

```
public class Main {
    public static void main(String[] args) {
        int x = 64;
        System.out.println(Math.sqrt(x));
    }
}
```

## Math.abs(x)

絕對值函數

```
public class Main {
    public static void main(String[] args) {
        double x = -4.8;
        System.out.println(Math.abs(x));
    }
}
```

## Math.random()

回傳0.0~1.0之間的隨機小數

```
Math.rendom();

// 可以更精準的產生隨機數字 0~100 之間

public class Main {
    public static void main(String[] args) {
        double num = Math.random();
        int randomNum = (int) (num * 101);
        System.out.println(randomNum);
    }
}
```

# Java Booleans

布林值 用來儲存兩種數值true or false 之一的
透過比較運算符比較兩遍數或值之間的關係

```
public class Main {
    public static void main(String[] args) {
        int votingAge = 20;
        int realAge = 25;
        System.out.println(realAge >= votingAge); // true
    }
}
```

**布林值是比較運算的基礎 e.g.: if..else**


## Conditions and if Statements

-  小於<
-  小於或等於<=
-  大於>
-  大於或等於>=
-  等於==
-  不等於!=

利用以上條件針對不同決策執行不同的操作

- if
- else
- else if
- switch 指定用來執行替代程式碼的區塊

## 語法

### if
```
public class Main {
    public static void main(String[] arg) {
        if (20 > 18) {
            System.out.println("Is true");
        }
    }
}
```

### else if
當第一個條件不符合時，再比較的條件，若符合則執行區塊中的程式碼
```
public class Main {
    public static void main(String[] arg) {
        int value = 20;
        if (value > 18) {
            System.out.println("block 1");
        } else if (value == 20) {
            System.out.println("block 2");     // 會執行這行
        } else {
            System.out.println("block 3");
        }
    }
}
```

### else
當所有條件都不符合時，則執行這區塊中的程式碼
```
public class Main {
    public static void main(String[] arg) {
        int value = 20;
        if (value < 18) {
            System.out.println("Is true");
        } else {
            System.out.println("Is false");
        }
    }
}
```

## Short Hand if...esle 

三元運算子 以一行程式碼取代多行

```
public class Main {
    public static void main(String[] arg) {
        int time = 20;
        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
    }
}
```
可以寫成
```
public class Main {
    public static void main(String[] arg) {
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
```

## Switch

當過多條件時使用if...else可能使程式碼變得較為複雜難讀

1. if...else 可以處理任何類型的條件，並可以嵌套多個來處理複雜邏輯
2. switch 只能處理整數、字元、字串的變數，不能處理布林、或複雜的邏輯。

- 表達式條件僅執行一次
- 將條件的值與每一種情況的值進行比較
- 當值相等時，則執行相關聯的程式碼區塊
- switch可以使用兩種關鍵字, break and default

### break

用來標記程式碼區塊，當執行完該程式碼區塊後就跳出switch.
因為switch會檢查表達式中所有的情況，使用break可以在找到答案時結束，不檢查剩餘情況而避免花費過多時間。

e.g.: 當條件值等於case 4 會印出4 5 6 7
```
int day = 4;
switch (day) {
    case 1:
        System.out.println("1");
    case 2:
        System.out.println("2");
    case 3:
        System.out.println("3");
    case 4:
        System.out.println("4");
        // 加入break 就會在這邊結束整個switch
        break; 
    case 5:
        System.out.println("5");
    case 6:
        System.out.println("6");
    case 7:
        System.out.println("7");
}
```

### default

當所有情況皆不符合時則執行

```
public class Main {
    public static void main(String[] arg) {
        int i = 5;
        switch (i) {
            case 1:
                System.out.println("none");
            case 2:
                System.out.println("none");
            case 3:
                System.out.println("none");
            case 4:
                System.out.println("none");
            default:
                System.out.println(i);
        }
    }
}
```

# Java Loop

當達成指定條件時，迴圈就可以執行一段程式碼。
節省時間、增加程式碼可讀性

## While

當條件為真，則執行while程式碼區塊中的程式碼
```
while (條件) {
    // 程式碼區塊
}

// e.g.:
public class Main {
    public static void main(String[] arg) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}

/* 
0 
1
2
3
4
*/
```

## Do/While

此迴圈與while唯一的不同是，一定會先執行一次程式碼後再判斷是否符合條件。

e.g.:
```
public class Main {
    public static void main(String[] arg) {
        int i = 0;
        do {
            System.out.println(i);  // 會印出0
            i++;
        }
        while (i > 5);
    }
}
```

## For

當明確知道要執行多少次迴圈時，使用for迴圈

- statement 1 : 在程式碼執行前先執行一次，通常是宣告起始變數
- statement 2 : 程式碼區塊執行的條件
- statement 3 : 在程式碼區塊執行後執行(每一次)

```
for (statement 1; statement 2; statement 3) {
    // 程式碼區塊
}

for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

依照程式碼順序
1. 首先會先宣告變數i為整數並賦值為0。
2. 接著比對程式碼條件 i 小於 5 的話，就執行程式碼區塊中的程式碼。
3. 完整執行一次程式碼區塊後，會將 i 加 1，再比對一次條件。
4. 直到不符合條件後。

## Nested

巢狀迴圈，外層迴圈每一次條件成立時，都會執行一次內層迴圈。

```
public class Main {
    public static void main(String[] arg) {
        for (int i = 0; i <= 2; i++) {
            System.out.println("Outer " + i);

        // INNER
            for (int j = 0; j <= 3; j++) {
                System.out.println("Inner " + j);
            }
        }
    }
}
```

## For-each

循環數組

```
for (type variableName : arrayName) {
    // 程式碼區塊
}

// e.g.
public class Main {
    public static void main(String[] arg) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) { 
            System.out.println(i);
        }
    }
}
```

# Java Brack and Continue

### Break

break可以跳離當前迴圈

e.g. 只會印出 0~3 
```
for (int i = 0; i < 10; i++) {
    if (i == 4) {
        break;
    }
    System.out.println(i);
}
```

### Continue

continue可以跳離當前迴圈中的迭代

```
public class Main {
    public static void main(String[] arg) {
        for (int i = 0; i < 10; i++) {
            // 印出除了4以外的值 0~10
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

# Java Array

數組是指在單一變數當中儲存多個值。

> type[] variableName = {"value1", "value2", "value3"};

e.g.:
```
String[] cars = {"Volvo, "BMW", "Ford"};

int[] nums = {10, 20, 30};
```

要存取數組可以依照數組的索引值進行存取，索引值從0開始計算

```
public class Main {
    public static void main(String[] arg) {
        int[] nums = {10, 20, 30};
        System.out.println(nums[0]); // 10
    }
}
```

要變更數組內的數值，依照索引值進行變更

e.g.:
```
int[] nums = {10, 20, 30};
nums[0] = 20;
System.out.println(nums[0]); // 20
```

## Array Length

可以使用length內建屬性，計算數組長度(數量)

```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length); // 4
```

結合迴圈，循環遍歷數組

e.g.: 根據索引值取得數組內元素
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
}
```

e.g.: for-Each 專門用來循環遍歷數組內元素的方法
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
    System.out.println(i);
}
```

## Multidimensional Arrays 多維數組

> type[][] varibleName = { {value1, value2}, { value3, value4 } };

```
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
```

### Loop

```
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int i = 0; i < myNumbers.length; ++i) {
  for (int j = 0; j < myNumbers[i].length; ++j) {
    System.out.println(myNumbers[i][j]);
  }
}
```

# Java Methods

方法是當程式呼叫時才會執行的一段程式碼又稱函數
可以將資料傳遞給函數。


## Create a Method

- myMethod() : 自訂函數名稱
- static : 表示此函數屬於 Main class 但不屬於 Main class 對象
- void : 表示此方法沒有回傳值

e.g.

```
public class Main {
    static void myMethod() {
        // 程式碼執行區塊
    }
}
```

## Call a Method

呼叫函數
函數名稱加上括號，並在後面加上分號

```
public class Main {
    static void myMethod() {
        System.out.println("executed");
    }

    public static void main(String[] args) {
        myMethod();
    }
}
```

## Parameters and Arguments

參數與引數
參數傳遞給函數，並在函數中作為變數使用
引數則是在呼叫函數時傳入的值

```
public class Main {
    // Parameters : fname 參數傳遞給函數作為變數
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    public static void main(String[] args) {
        // Arguments : Liam 引數作為值傳遞給方法
        myMethod("Liam");
    }
}
```

可以傳遞任意數量的參數

```
public class Main {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " Refsnes");
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 28);
    }
}
```

在函數內常會使用if...Else

```
public class Main {
    static void checkAge(int age) {
        
        if (age >= 18) {
            System.out.println("LEGAL");
        } else {
            System.out.println("Illegal");
        }
    }

    public static void main(String[] args) {
        checkAge(18);
    }
}
```

## Return values 回傳

在之前的所有範例都有使用 void 這代表此函數不回傳值。
若希望函數有回傳值，則可以用原始資料類別代替 void 並在函數內部使用 return 將值回傳。

```
public class Main {
    static int myMethod(int num) {
        // num 作為變數傳入函數
        // 5 + 3
        // 回傳 8
        return num + 3;
    }

    public static void main(String[] args) {
        // 5 作為呼叫函數時的引數傳入函數中使用
        
        // 印出 8
        System.out.println(myMethod(5));
    }
}
```

將回傳值用變數儲存起來，較易於管理與閱讀

```
public class Main {
    static int checkout(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int num = checkout(10, 20);
        System.out.println(num);
    }
}
```

## Overloading

透過函數重載，相同函數名稱可以有不同的參數傳遞 
只要參數的型別/數量不同就可以透過函數重載

```
public class Main {
    static int myNum(int x, int y) {
        return x + y;
    }

    static double myNum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int IntNum = myNum(10, 20);
        double doubleNum = myNum(8.1, 21.9);
        System.out.println(IntNum);
        System.out.println(doubleNum);
    }
}
```


## Scope

在Java當中，變數只能在它們建立的區域內進行存取，又稱函數作用域
而函數作用域，則是指在{}當中的所有程式碼，存取變數必須在宣告變數行之後。

```
public class Main {
    public static void main(String[] args) {

        // 在這裡存取變數 x 會出現錯誤 因為{}範圍中並未宣告 x
        // 這邊也無法訪問下方的{}去存取 x 的值
        // System.out.println(x);

        {
            // 在這範圍中有宣告 x 所以可以存取變數 x 
            int x = 100;
            System.out.println(x);
        }
    }
}
```

# Java Recursion 遞迴

- 遞迴函數是指呼叫自己的函數
- 遞迴函數必須要有能夠停止遞迴的條件，否則會陷入無限遞迴的情況

e.g.: 以下範例為將一系列的數字相加

1. 在main當中呼叫sum函數，並傳入10作為引數
2. 而sum函數接受10這個引數值，開始執行函數作用域當中的程式碼
3. 這邊用if...else 回傳引數值並加上再呼叫自己 停止遞迴的條件為當引數值等於0時則結束 
4. 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0);
5. 55

```
public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    // 遞迴
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
```

e.g.: 將5~10之間數相加 當 end 不大於 start

```
public class Main {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result); // 45
    }

    public static int sum(int start, int end) {
        
        if (start < end) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
```

# Java Classes

## OOP 物件程式導向語言

- keep the Java code DRY，易於維護、修改及調試
- 建立可重用應用程式

類別是物件的模板，物件則是類別的實例

e.g.: 
- 類別 水果, 物件 蘋果, 西瓜, 草莓
- 類別 車,   物件 BMW, Toyota, Volvo

## Class

create a class, use the keyword class:

```
public class Main {
    int x = 5;
}
```

**類別的名稱首字需大寫，並且與.java檔案名稱相同**

## Object

object is create from a class
若要建立Main的物件，類別名稱 物件名稱 new 類別名稱();

```
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

## Multiple Objects

一個類別可以有多個物件 e.g.: 類別為汽車, 物件1 Toyota, 物件2 Audi, 物件3 volvo
可以變更單一對象中的屬性值，而不會互相影響

```
public class Cars {
    // 類別當中的屬性
    int 輪胎 = 4;
    int 引擎 = 1;
    int 方向盤 = 1;
    public static void main(String[] args) {
        Cars toyota = new Cars();
        Cars audi = new Cars();
        Cars volvo = new Cars();
        // volvo 增加為雙引擎
        volvo.引擎 = 2;
        System.out.println(toyota.輪胎)  // 4
        System.out.println(audi.引擎)    // 1 不會因為volvo的屬性值修改為2就變成2
        System.out.println(volvo.方向盤) // 1
    }
}
```

## Multiple Classes

也可以創建一個類別的物件，並在另一個類別中存取它。
> 一個類別擁有所有屬性和方法，另一個類別則擁有main()方法要執行的程式碼

```
// Main.java
public class Main {
    int x = 10;
}

// Second.java
class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj); // 10
    }
}
```

## Attributes

e.g.:
類別屬性，或者是類別中的變數
在這裡 x, y 是 Main類別中的屬性也稱作變數

```
public class Main {
    int x = 5;
    int y = 3;
}
```
e.g.:
建立類別的物件並使用點語法(.)來存取、修改屬性。
若不想讓屬性可變則可以在類別宣告前加上 final

```
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        // myObj.x = 15; // 修改類別中的屬性 x
        System.out.println(myObj.x);  // 5
        // System.out.println(myObj.x); // 15
    }
}
```

e.g.:在一個類別當中可以建立任意數量的屬性

```
public class Main {
    // 這裡建立了三個屬性, fname, lname, age
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.fname + " " + myObj.lname);
        System.out.println("Age:" + myObj.age);
    }
}
```

## Methods (Static vs Public)

在一個類別當中可以有多種方法

### Static Method

靜態方法不用建立物件即可呼叫

### Public Method

公共方法則需要建立物件才可呼叫

```
public class Main {

    static void myStaticMethod() {
        System.out.println("Static");
    }

    public void myPublicMethod() {
        System.out.println("Public");
    }

    public static void main(String[] args) {
        myStaticMethod();
        // myPublicMethod(); // error: non-static method myPublicMethod() cannot be referenced from a static context

        // 建立Main類別的物件 myObj 並呼叫物件的公共方法
        Main myObj = new Main();
        myObj.myPublicMethod();
    }
}
```

## Access Methods With an Object

如何使用物件存取方法
e.g.: 建立一個名稱為 myCars 的 Car物件, 呼叫在myCars物件中的方法, fullThrottle() and speed()

```
public class Main {

    public void fullThrottle() {
        System.out.println("The car");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max Speed: " + maxSpeed);
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.fullThrottle();
        myObj.speed(200);
    }
}
```

## Constructors 建構函數

用於初始化物件，當創建類別的物件時呼叫建構函數，並設定物件屬性的初始值。
- 建構函數必須與類別的名稱相同
- 建構函數不能有 void 

```
public class Main {
    
    // create Constructors
    public Main() {
        x = 5;
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

e.g.: 帶參數的建構函數

Main.java
```
public class Main {
    String carName;
    int carNum;

    public Main(String txt1, int num1) {
        carName = txt1;
        carNum = num1;
    }
}
```

Second.java
```
class Second {
    public static void main(String[] args) {
        Main myObj = new Main("Toyota", 1007);
        System.out.println(myObj.carName);
        System.out.println(myObj.carNum);
    }
}
```

**所有類別皆會有建構函數，當沒有特別設置時Java會自行建立，缺點是無法自行設定初始值。**

## Modifiers 修飾字符

> 存取修飾字符 用於設定類別、屬性、方法及建構函數的存取級別。

類別關鍵字: 

- public  : 該類別允許所有類別皆可存取
- default : 該類別只允許在同一包中的類別存取

屬性、方法及建構函數關鍵字:

- public    : 所有類別皆可存取程式碼
- private   : 只允許在聲明程式碼的類別中存取
- protected : 可在同一個package和子類別中存取 (繼承)
- defaule   : 若未指定字符，則只允許在同一個package中存取程式碼。

> 非存取修飾字符

類別關鍵字:

- final    : 用於標示該類別不能被其他類別所繼承
- abstract : 該類別不能用於建立物件

屬性、方法關鍵字:

- final        : 該屬性、方法不能被覆寫、修改。
- static       : 屬性、方法屬於類別而非物件。
- abstract     : 只可用在抽象類別上，並只能用於方法上。
- transient    : 序列化包含屬性、方法的物件時會跳過它。
- synchronized : 方法一次只能被一執行緒執行。
- volatile     : 屬性不會在本地緩存，始終由主內存中讀取。

#### Final

```
public class Main {
    final int x = 10;
    final double PI = 0.01;

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 50;
        myObj.PI = 25;
        System.out.println(myObj.x); // error: cannot assign a value to final variable x
    }
}
```

#### Static

```
public class Main {

    static void myStatic() {
        System.out.println("Static");
    }

    public static void main(String[] args) {
        myStatic(); // 無須建立類別的物件即可存取
    }
}
```

#### Abstract

當定義了抽象類別、方法

1. 抽象類別不可實例化
2. 抽象方法沒有方法體，必須由子類別中實現
3. 子類別必須實現繼承的類別中的所有抽象方法

Main.java
```
abstract class Main {
    public String fname = "John";
    public int age = 24;
    // abstract 這裡定義了一個抽象方法study();
    public abstract void study();
}

// student類別繼承了抽象類別 Main，所以必須要實現Main類別當中 study()方法
class Student extends Main {
    public int year = 2000;
    public void study() {
        System.out.println("Studying");
    }
}
```

Second.java
```
class Second {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println(myObj.fname);
        System.out.println(myObj.age);
        myObj.study();
    }
}
```

## Encapsulation

封裝是為了將敏感資料對使用者隱藏

- 將類別/屬性宣告私有(Private)
- 提供公開的 get and set方法來存取和更新私有變數的值

e.g.: 
作為 private 宣告的私有變數只能在宣告的類別中存取
但如果提供公開的get and set方法就可以存取和修改私有變數

Main.java
```
// private 
public class Main {
    private int result = 10;

    public int getNum() {
        return result;
    }

    // 這裡的this用來明確表示正在訪問類別的result屬性
    public int setNum(int value) {
        this.result = value;
        return this.result;
    }
}
```

Second.java
```
class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        // 因為是私有變數所以無法直接修改，需要透過類別中公開的方法來取得變數值或修改變數值
        // myObj.result = 20; // error: result has private access in Main
        // System.out.println(myObj.result); // error: result has private access in Main
        myObj.setNum(20);
        System.out.println(myObj.getNum()); // 20
    }
}
```

# Java Packages / API

- Built-in Packages (packages from the Java API)
- User-defined Packages (create your own packages)

## Built-in Packages

[Java API](https://docs.oracle.com/javase/8/docs/api/)

可以依照自己的需求引入整個(套件)Packages或單一的類別/屬性(classes)

#### 語法:
```
import packages.name.Class;  // 只引入套件當中單一的類別
import packages.name.*;      // 引入整個套件
```

e.g.:
```
// 引入java.util這個套件裡面的Scanner這個類別
import java.util.Scanner;

// 要使用Scanner則需要建立該類別的物件，並可以使用該類別中的任何方法

class MyClass {
    public static void main(String[] args) {
        // 建立Scanner類別的物件
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        // 使用nextLine()方法
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
```

## User-defined Packages

要自行建立套件，需要使用 package 關鍵字
就像資料夾有階層一樣

> └── root
>  └── mypack
>    └── MyPackageClass.java

```
// 包名小寫 避免與類別名稱衝突
package mypack;
class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is my package!");
    }
}
```
1. 在相同目錄底下創建一個class
```
javac MyPackageClass.java
```

2. 將套件創建在相同目錄底下 使用 -d .
```
javac -d . MyPackageClass.java
```

3. 使用剛才創建的mypack套件中的MyPackageClass類別
```
java mypack.MyPackageClass
```

4. output
> This is my package!

# Java Inheritance

可以將一個類別當中的屬性/方法，繼承到另一個類別當中使用。
在建立新類別時可以重複使用現有類別中的屬性和方法。提供程式碼的重複使用性

#### 繼承則分為兩種方式

> 繼承就像是「家族遺傳」。你可以把一個類別（超類別）當作父母，另一個類別（子類別）當作孩子。孩子會繼承父母的一些特徵（屬性和方法），但也可以有自己的特徵。

superclass(超類別)

- 超類別就像是父母，定義了一些基本的特徵和行為。
- 假設有一個動物類別(Animal)，它有一個方法是eat()，表示動物會吃東西。

subclass(子類別)

- 子類別就像是孩子，繼承了父母的特徵和行為，但也有自己的特徵和行為。
- 假設有一個狗類別(Dog)，它繼承了動物類別(Animal)，所以它也有eat()方法，此外狗還有自己的方法bark()，表示狗會叫。

```
// 若是不想讓其他類別繼承 則可以使用 final
// final class Animal
class Animal {
    // 在這邊使用protected(受保護的存取修飾字符)供子類別可以存取
    protected String name = "bingo";
    public void eat() {
        System.out.println("can eat!");
    }
}

// 當子類別要繼承父類別時要使用 extends關鍵字
class Dog extends Animal {

    public void bark() {
        System.out.println("can bark!");
    }

    public static void main(String[] args) {
        Dog myObj = new Dog();
        System.out.println(myObj.name);
        myObj.eat();
        myObj.bark();
    }
}
```

## Polymorphism

多態性意謂著多種形式 -
當有許多透過繼承相互關聯的類別時。

e.g.: 
動物都會叫，不過各自都有各自的叫聲(多種形式)
都分別各自有animalSound()這個方法
```
// Polymorphism

// superclass
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// subclass extends superclass
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Pig extends Animal {
        public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
// create Main

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Pig pig = new Pig();

        animal.animalSound();
        dog.animalSound();
        pig.animalSound();
    }
}
```

# Java Inner Classes

嵌套類別，類別中的類別
目的在於將屬於一起類別分組並放在一塊方便管理。

要存取內部類別，則需要先建立外部類別的物件，再建立內部類別的物件
```

class Outside {
    int x = 10;

    class Inner {
        int y = 20;
    }
}


class NestClass {

    public static void main(String[] args) {
        Outside outside = new Outside();
        Outside.Inner inner = outside.new Inner();
        System.out.println(outside.x * inner.y);
    }
}
```

在嵌套類別當中也可以將內部類別宣告為私有或是受保護以及靜態

#### 若不希望內部類別被存取則可以使用private宣告
```
class Outside {
    int x = 10;

    private class Inner {
        int y = 20;
    }
}

class NestClass {

    public static void main(String[] args) {
        Outside outside = new Outside();
        Outside.Inner inner = outside.new Inner(); // error: Outside.Inner has private access in Outside
        System.out.println(outside.x * inner.y);
    }
}
```

#### 內部類別也可以用靜態宣告

不需要建立外部類別的物件就可以存取內部類別
```
class Outside {
    int x = 10;

    static class Inner {
        int y = 20;
    }
}

class NestClass {

    public static void main(String[] args) {
        Outside.Inner inner = new Outside.Inner(); 
        System.out.println(inner.y); // 20
    }
}
```

#### 內部類別可以存取外部類別中的屬性/方法

```
class Outside {

    int x = 10;

    class Inner {
        public int innerMethod() {
            return x;
        }
    }
}

public class NestClass {
  public static void main(String[] args) {
    Outside myOuter = new Outside();
    Outside.Inner myInner = myOuter.new Inner();
    System.out.println(myInner.innerMethod());    // 10
  }
}
```

# Java Abstraction 

> abstract 是非存取修飾關鍵字
> 資料抽象化，主要是隱藏一些實作細節，僅提供實作的結果資料給使用者知曉。

1. Abstract Class  抽象類別
抽象類別是一種不可以被實例化的類別，它可以包含抽象方法(無實作)、具體方法(有實作)。主要用來定義一個模板，讓子類別繼承並實作具體的行為。

2. Abstract Method 抽象方法
抽象方法是一種沒有實作的方法，沒有方法的主體，主體由繼承的子類別所提供。

**資料抽象化優點是具有安全性，隱藏某些細節並只顯示物件的重要細節**

```
// Abstract 抽象化

// superclass 父類別又稱超類別
abstract class Animal {
    // abstract method
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

// supclass   子類別繼承父類別
class Pig extends Animal {

    public void animalSound() {
        System.out.println("wee wee");
    }
}

class AbstractClass {

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
```

# Java Interface

另一種實作抽象化的方式是介面
> 介面是"完全"抽象類別，將方法與空主體組合在一起
> 要使用介面方法與繼承的方式相同只是使用的關鍵字不同 這裡使用 implements

1. 介面無法建立物件.
2. 在介面中方法沒有主體，主體由實作類別來實現.
3. 介面方法預設為 abstarct and public，介面屬性則預設為public, static and final.
4. 介面不包含建構函數 (因為無法建立類別的物件)

**在Java中不具備多重繼承，不過可以使用介面來實現**

e.g.: 
```
// interface 
interface School {
    public void place();
}

interface Teacher {
    public void name();
}

// implements 
class Student implements School, Teacher {

    public void place() {
        System.out.println("TPE School");
    }

    public void name() {
        System.out.println("John");
    }
}

class InterfaceClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.place();
        student.name();
    }
}
```

## Enums 

當確定值為不可變時可以使用 列舉(枚舉)
用於表示一組常數(不可變)

#### 與classes的差別
1. 列舉與類別一樣可以具有屬性&方法
2. 唯一不同的是列舉所包含的常數 public, static and final (不可覆蓋不可變更)

e.g.: 
> 使用關鍵字 enum 建立一組常數分別由逗號隔開，常數名稱為大寫
> 要存取列舉中的常數時則用 .存取
```
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

Level myVar = Level.LOW;
```

in class :
```
class EnumsClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.LOW;
        System.out.println(myVar);
    }
}
```

in Switch
```
// 列舉 常數要大寫並以逗號分隔
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumsClass {
    public static void main(String[] args) {
        // 存取列舉中的常數 使用 .存取
        Level myVar = Level.LOW;
        // Switch
        switch (myVar) {
            case LOW:
                System.out.println("LOW");
            case MEDIUM:
                System.out.println("MEDIUM");
            case HIGH:
                System.out.println("HIGH");
        }
    }
}
```

## Java Dates 

import java包 主要展示如何在自己的當中class當中引用其他package的類別並使用
在java中並沒有 built-in Date 類別, 就可以引入java.time.className 來使用

| 類別(className)    | 用途                 |
| LocalDate         | 取得目前年月日        |
| LocalTime         | 取得目前時間          |
| LocalDateTime     | 取得目前年月日/時間    |
| DateTimeFormatter | 取得格式化後的日期時間  |


e.g.: LocalDate class
```
// 引入包
import java.time.LocalDate;

public class DateClass {
    public static void main(String[] args) {
        // 建立LocalDate類別的物件
        // 並使用物件中的 now()方法
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate); // 2024-10-11
    } 
}
```

e.g.: LocalTime class
```
// 引入包
import java.time.LocalTime;

public class DateClass {
    public static void main(String[] args) {
        LocalTime myTime = LocalTime.now(); // 14:46:57.251062600
        System.out.println(myTime);
    }
}
```

e.g.: LocalDateTime
```
import java.time.LocalDateTime;

public class DateClass {
    public static void main(Srting[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime); // 2024-10-11T14:49:44.757740700
    }
}
```


## Java ArrayList

java內建陣列與ArrayList的差別在於陣列大小無法改變，
若是要新增或刪除陣列中元素則必須要新增一個新的陣列。

e.g.: 
用ArrayList所建立的陣列則中可以隨時新增或刪除陣列中的元素
```
import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        // 建立ArrayList類別的物件並新增變數名稱為cars的字串陣列
        ArrayList<int> cars = new ArrayList<int>();
        // 使用ArrrayList類別中的 add()方法 在cars陣列當中新增元素
        cars.add("one");
        cars.add("two");
        System.out.println(cars); // [one, two]
        // 也可以透過索引值來新增元素在指定的位置 陣列索引值從頭由0開始計算
        cars.add(0, "true one");
        System.out.println(cars); // [true one, one, two]
        // 使用索引值來存取陣列元素
        String txt = cars.get(0);
        System.out.println(txt); // true one
        // 修改陣列中的元素
        cars.set(0, "true");
        System.out.println(cars); // [true, one, two]
        // 刪除陣列中元素
        cars.remove(0);
        System.out.println(cars); // [one, two]
        // 刪除陣列中所有元素
        cars.clear();
        System.out.println(cars); // []
        // 檢查陣列大小
        System.out.println(cars.size()); // 0
    }
}
```

循環遍歷陣列當中的元素 
for-loop
```
import java.util.ArrayList;

public class LoopArrayClass {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("1");
        nums.add("2");
        nums.add("3");
        System.out.println(nums);
        for (int i = 0; nums.size() > i; i++) {
            System.out.println(nums.get(i));
        }
    }
}
```

for-each
```
import java.util.ArrayList;

public class LoopArrayClass {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("1");
        nums.add("2");
        nums.add("3");
        System.out.println(nums);
        for (String i = nums) {
            System.out.println(nums.get(i));
        }
    }
}
```

建立陣列時同時會先設定好陣列的類型
若是要建立其他類型的陣列則需要建立對應的類型。

e.g.: int類型陣列
```
import java.util.ArrayList;
// 
import java.util.Collections;

public class LoopArrayClass {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(20);
        nums.add(40);
        for (int i : nums) {
            System.out.println(i);
        }
        // 排序陣列
        // Collections.sort(nums);   // [10, 20, 30, 40]
        // System.out.println(nums); // [10, 20, 30, 40]
        // 倒序陣列
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums); // [40, 30, 20, 10]
    }
}
```

## Java HashMap

HashMap將項目儲存在 key/value 並使用key去存取value
可以將一個物件當作另一個物件(值)的鍵(索引)
可以儲存不同類型: String keys and Integer values, or String keys and String values

建立 HashMap object
```
import java.util.HashMap;

HashMap<String, String> capitalCities = new HashMap(String, String)();
```

HashMap類別中的方法
```
import java.util.HashMap;

HashMap<String, String> capitalCities = new HashMap(String, String)();

// 新增 put();
capitalCities.put("England", "London");
capitalCities.put("Germany", "Berlin");
System.out.println(capitalCities);

// 存取 get();
System.out.println(capitalCities.get("England")); // "London"

// 刪除 remove();
capitalCities.remove("England");
System.out.println(capitalCities); // {Germany=Berlin}

// 全部刪除 clear();
capitalCities.clear();
System.out.println(capitalCities); // {}

// 查詢大小 size();
System.out.println(capitalCities.size()); // 0
```

當需要循環遍歷取得hashMap建立的物件中的key/value
分別需要使用各自不同的方法來存取

key: 物件.keySet()
valut: 物件.values()
```
import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
    }
}
```

## Java HashSet

HashSet可以建立一個集合，其中的每一個項目都是唯一的
使用java.util包來取得HashSet類別

```
import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        // 使用HashSet建立String類型的cars物件
        HashSet<String> cars = new HashSet<String>();
        // 新增陣列元素
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        // 即便再新增了一個BMW, 因為在集合當中每一個項目都是唯一的所以也只會出現一次
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        // 當我們需要確認集合當中是否有這個項目時可以使用 contains();
        // 回傳布林值 若有 true 否則 false
        System.out.println(cars.contains("BMW")); // true

        // 刪除 remove();
        cars.remove("BMW");
        System.out.println(cars); // [Volvo, Mazda, Ford]

        // 全部刪除 clear();
        cars.clear();
        System.out.println(cars); // []

        // 查詢大小 size();
        System.out.println(cars.size());
    }
}
```

HashSet也可以建立別種類型的物件

```
import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<Integer>();
        nums.add(0);
        nums.add(7);
        nums.add(3);
        nums.add(11);
        
        for (int i = 1; i <= 10; i++) {
            if (nums.contains(i)) {
                System.out.println(i + " in the nums set");
            } else {
                System.out.println(i + " not in the nums set");
            }
        }
    }
}
```


## Java Iterator

迭代是可以用來循環集合的對象
像是ArrayList and HashSet，迭代其實就是循環的技術術語

```
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        // 建立String類型的物件並新增元素
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Audi");

        // 建立cars物件的迭代器
        Iterator<String> it = cars.iterator();

        // 使用迭代器的方法取得物件中的元素 依照順序列印物件中的項目
        System.out.println(it.next()); // Volvo
    }
}
```

當我們要使用迭代器來循環遍歷陣列中的元素時
必須要使用hasNext()方法和next()方法並用 while

```
public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();

        Iterator<String> it = cars.interator();

        while (it.hasNext()) {
            if (it.next() <= 10) {
                System.out.println(it.next());
            }
        }
    }
}
```

使用迭代器中的remove()方法來刪除陣列中元素

```
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(11);
        nums.add(1);
        nums.add(5);
        nums.add(6);

        // 建立nums物件的迭代器
        Iterator<Integer> it = nums.iterator();

        // 使用while 透過hasNext遍歷cars陣列中元素
        // 並使用if檢查元素是否符合所設條件若不合則刪除元素
        while(it.hasNext()) {
            Integer i = it.next();
            if (i > 10) {
                it.remove();
            }
        }

        System.out.println(nums);
    }
}
```

## Java Wrapper 

包裝類別提供了將原始資料類型包裝成物件的方法
String是物件且不是原始資料類型所以可以直接使用
但如果是 (int, char, boolean...)這些原始資料類型沒辦法包裝成物件
所以必須要使用原始資料類型所對應的包裝類別來建立物件。

| 原始資料類型 | 對應包裝類別 |
| byte | Byte |
| short| Short |
| int  | Integer|
| long | Long |
| float| Float |
| double | Double |
| boolean | Boolean |
| char | Character |

e.g.: 當要將int類型包裝成物件時
```
import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        // ArrayList<int> nums = new ArrayList<int>(); // 這是錯的
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Integer num = 5;
        System.out.println(num); // 5
        System.out.println(num.intValue()); // 5
    }
}
```

## Java Exceptions

在執行程式碼的過程當中可能會出現不同錯誤，
當發生錯誤的當下Java會停止執行並產生錯誤訊息。

#### Java try and catch
```
// try 定義一個程式碼區塊，以便在執行時測試錯誤。
try {
    // 程式碼測試區塊

}
// catch (Exception e) 定義了一個當try區塊的程式碼出現錯誤時要執行的程式碼區塊
catch {
    // 當try出現錯誤時要執行的程式碼區塊
}
```

當程式碼出現錯誤時 Terminal終端會拋出java內建的錯誤訊息
```
public class Main {
  public static void main(String[ ] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // error!
  }
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
at Main.main(Main.java:4)
*/
```

透過try...catch修改後 當try區塊的程式碼出現錯誤，將會執行catch區塊中的程式碼。
```
public class Main {
  public static void main(String[ ] args) {
    try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); 
    } catch (Exception e) {
        System.out.println("Error"); // Error
    }
  }
}
```

finally 區塊則是無論如何皆會執行的程式碼區塊
```
public class Main {
  public static void main(String[ ] args) {
    try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); 
    } catch (Exception e) {
        System.out.println("Error"); // Error
    } finally {
        System.out.println("finally try and catch"); // finally try and catch
    }
  }
}
```

## The throw keyword

throw 語句允許自訂錯誤
通常會與異常類型一起執行。
在java當中有許多異常的類型可以使用

1. ArithmeticException          : 算術異常
2. FileNotFoundException        : 找不到文件
3. ArrayIndexOutBoundsException : 陣列的索引值超出邊界

```
public class ThrowClass {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("must be at least 18 years old");
        }
        else {
            System.out.println("old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
```

## Java Threads

執行緒允許程式透過同時執行多項的操作來更有效的運行程式。

create a Thread

1. 當該類別擴展Thread類別時，則可以建立該類別的實例，並使用該類別的start()方法來運行執行緒
```
public class ThreadClass extends Thread {
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
```

2. 實作Runnable線程接口，則可以透過將類別的實例傳遞給Thread物件的建構函數然後呼叫start()方法來運行執行緒
```
public class ThreadRunnableClass implements Runnable {
    public static void main(String[] args) {
        ThreadRunnableClass obj = new ThreadRunnableClass();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
```

## Java Lambda Expressions

Java 8 加入了 Lambda 表達式
使代碼更加簡潔、可讀性高

1. 使用匿名內部類別時，每個操作都需要定義一個物件，而 Lambda 則使用簡單的語法來實現操作。
```

// 使用匿名內部類時 每個操作都需要定義一次新的匿名內部類
MathOperation addition = new MathOperation() {
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}

// 使用 Lambda 則不需要每一次都定義一次新的匿名內部類
MathOperation addition = (a, b) -> a + b;
```

## Java Advanced Sorting 

進階排序
若要針對物件進行排序，需要指定一個規則來決定如何對物件排序
舉例: 汽車列表, 我想要依照汽車的年份進行排序, 規則可能就是較早的年份排序在最上方


Comparator: 定義一個外部比較器，用於物件的自定義排序
```
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

class SortByYear implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return b.year - a.year; // 按年份降序排序
    }
}

public class ComparatorsClass {
    public static void main(String[] args) {
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X6", 2022));
        myCars.add(new Car("Honda", "Accord", 2007));
        myCars.add(new Car("Ford", "Mustang", 1975));

        Comparator<Car> myComparator = new SortByYear();
        Collections.sort(myCars, myComparator); // 使用自定義排序

        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}
```

Comparable:  物件本身實現此接口，並定義排序順序
```
import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    @Override
    public int compareTo(Car other) {
        return this.year - other.year; // 
    }
}

public class ComparatorsClass {
    public static void main(String[] args) {
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X6", 2022));
        myCars.add(new Car("Honda", "Accord", 2007));
        myCars.add(new Car("Ford", "Mustang", 1975));

        Collections.sort(myCars); // 

        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}
```

# Java Regular Expressions

RegEX 正規表達式
正規表達式是形成搜尋模式的字元序列，
當想要在文字中搜尋想要的內容時，則可以使用此搜尋模式來描述要搜尋的內容。

1. 正規表達式可以是單一字符也可以是更複雜的模式
2. 正規表達式可以用於執行所有類型的文字搜尋和文字取代操作
3. 在Java當中並沒有內建正規表達式的類別，所以要匯入import.util.Regex套件來使用

- Pattern Class - 定義模式
- Matcher Class - 用於搜尋模式

[java.util.regex](https://docs.oracle.com/javase/8/docs/api/index.html?java/util/regex/package-summary.html)

[w3school regex](https://www.w3schools.com/java/java_regex.asp)
```
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExClass {
    public static void main(String[] args) {
        // 創建正規表達式模式
        // 編譯正規表達式"Hello",並設置匹配時不分大小寫
        Pattern pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
        // 創建匹配器
        // 使用編譯好的模式來匹配字串
        // 這裡要匹配的字串為"Hello World!!"
        Matcher matcher = pattern.matcher("Hello World!!");
        // 執行匹配器
        // 當找到則返回true 否則false
        boolean matchFound = matcher.find();
        // 根據匹配的結果執行程式碼
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
```

# Java File

Java具有多種建立、讀取、更新、刪除檔案的方法

## Java File Handling


引入[java.io套件](https://www.istak.org.tw/Java_6_API_CH/java/io/package-summary.html)

```
import java.io.File;

// 這裡要使用File，需要建立File的物件並指定要處理的檔案名稱 (檔案要放在與java相同目錄裡)
File myObj = new File("filename.txt");
```

在File類別當中有許多方法

| 方法 | 類型 | 說明 |
| canRead() | Boolean | 測試文件是否可讀取 |
| canWrite()| Boolean | 測試文件是否可寫(修改) |
| createNewFile() | Boolean | 建立一個空文件 |
| delete() | Boolean | 刪除文件 |
| exists() | Boolean | 測試文件是否存在 |
| getName() | String | 回傳文件的名稱 |
| getAbsolutePath() | String | 回傳文件的絕對路徑 |
| length() | Long | 回傳檔案的大小 (bytes) |
| list() | String[] | 回傳目錄中的檔案陣列 |
| mkdir() | Boolean | 建立一個目錄 |

Create File
```
import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        // 
        try {
            // 
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("File Error.");
        }
        
    }
}
```

Create File & Write File
```
import java.io.File;

public class FileWriteClass {
    public static void main(String[] args) {
        // 
        try {
            // 
            File myObj = new File("filename.txt");
            myObj.write("input txt txt txt");
            myObj.close();
            System.out.println("Succssful write File.");
        } catch (Exception e) {
            System.out.println("File Error.");
        }
        
    }
}
```

Read a File
```
// 引入套件
import java.io.File;
// 引入Scanner套件讀取文件
import java.util.Scanner; 
// 引入錯誤處理套件
import java.io.FileNotFoundException;

public class FileReadClass {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner scanner = new Scanner(myObj);
            while (myObj.hasNextLine()) {
                String data = myObj.nextLine();
                System.out.println(data);
            }
            myObj.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
            e.printStackTrace();
        }
    }
}
```

Delete a File
```
// 引入套件
import java.io.File;

public class DeleteClass 
{
    public static void main(String[] args)
    {
        // 建立File類別的物件
        File myObj = new File();
        // 使用delete()方法
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.")
        }
    }
}
```

Delete a Folder (必須為空)
```
// 引入套件
import java.io.File; 

public class DeleteClass {
  public static void main(String[] args) { 
    // 建立File類別的物件, ()放入folder的路徑
    File myObj = new File("C:\\Users\\MyName\\Test"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the folder: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the folder.");
    } 
  } 
}
```