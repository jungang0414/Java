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