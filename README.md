# Snake Game

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

**Sebuah permainan ringan yang dimainkan dengan tokoh utamanya berbentuk ular. Permainan ini mempunyai misi yaitu mengharuskan Anda untuk mengumpulkan skor dengan cara menggerakkan ular tersebut ke objek dan memakannya.Semakin banyak objek yang ular tersebut makan, maka semakin panjang juga tubuh ular yang Anda mainkan Selain itu, terdapat aturan bila ular menyentuh batas frame atau tubuhnya sendiri, maka permainan selesai**

## Credits
| NPM           | Name              |
| ------------- |------------------ |
| 140810210055  | Varian Avila Faldi|
| 140810210033  | Mohammad Sulaeman |
| 140810210013  | Muhammad Giat     |

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (14/11/2022)** 
   - Assign Repo Project UAS
   - Instalasi & Eksplorasi Gradle & JavaFX
   - Mengisi Sprint keseluruhan
   - Membuat Frame Area
   - Membuat object makanan
   - Membuat object ular 
   - Membuat tampilan awal permainan
   - Membuat logic pergerakan ular
   - Membuat logic makanan     
   - Membuat logic untuk skor  
   - Membuat tampilan skor  
   - Membuat tampilan leaderboard 
   - Membuat UML                  
   - Membuat inteface awal        
   - Membuat level game           
   - Fix Bug    

- **[Sprint 1](changelog/sprint-1.md) - (date from 14/11/2022 until 21/11/2022)** 
   - Assign Repo Project UAS
   - Instalasi & Eksplorasi Gradle & JavaFX
   - Mengisi Sprint keseluruhan

- **[Sprint 2](changelog/sprint-2.md) - (date from 22/11/2022 until 28/11/2022)** 
   - Membuat Frame Area
   - Membuat object makanan
   - Membuat object ular 
   - Membuat tampilan awal permainan
   - Membuat logic pergerakan ular
   - Membuat logic makanan     
   - Membuat logic untuk skor  
   - Membuat tampilan skor     
   
- **[Sprint 3](changelog/sprint-3.md) - (date from 29/11/2022 until 06/12/2022)** 
   - Membuat tampilan leaderboard 
   - Membuat UML                  
   - Membuat inteface awal        
   - Membuat level game           
   - Fix Bug                      

## Running The App

1. Masuk ke direktori SnakeGame (Folder SnakeGame)
``` 
 contoh : cd project-akhir-uas-pbo-2022-kelompok-a-03/app/src/main/java/project/projectSnake/SnakeGame.java
 ``` 
2. Jalankan program dengan perintah :
``` 
 gradle run
 ``` 
3. Tombol pada keyboard yang digunakan pada program :
   - Gunakan tombol `Up Arrow` , `Right Arrow` , `Down Arrow` , dan `Left Arrow` untuk mengarahkan ular.
   - Gunakan tombol `Spasi` untuk pause dan mulai kembali game
   - Gunakan tombol `Enter` mulai kembali game setelah game over

4. Tombol pada mouse yang digunakan pada program :
   - Gunakan mouse untuk navigasi pada menu utama dan mengubah level pada menu level.

## Classes Used

`SnakeGame.java`
- Program utama yang berisi method main
   - 12 Class Variable
      - **@speed** - Mengatur kecepatan ular
      - **@width** - Lebar dari field game
      - **@blockSize** - Field background dari game
      - **@gameOvers** - Cek Game sudah selesa atau belum
      - **@gamePaused** - Menghentikan permainan sementara
      - **@gameField** - Menampilkan void atau method dari class gameField
      - **@gameScene** - Pemanggil Scene
      - **@score** - Menampilkan Score
      - **@nameArray** - Menampilkan nama user
      - **@pointArray** - Menampilkan point user
      - **@levelArray** - Mengatur level game
      
   - 2 Method
      - **@start()** - Memulai Game
      - **@tick()** - Mengecek apakah game masih berjalan atau tidak
      - **@AnimationTimer()** - Mengatur waktu animasi
      - **@handle()** - Mengatur jalannya game

`Block.java`
- Kelas untuk menampilkan koordinat game
   - 6 Class Variable
      - **@blockSize** - Menampilkan koordinat
      - **@x** - Koordinat x
      - **@y** - Koordinat y
      - **@prevX** - Menampilkan Koordinat sebelum x
      - **@prevY** - Menampilkan Koordinat sebelum y
      - **@previous** - Menampilkan Koordinat sebelumnya

   - 12 Method
      - **@Block()** - Berupa Construct dari class Block 
      - **@getPosX()** - Mengambil nilai dari x  
      - **@getPosY()** - Mengambil nilai dari Y  
      - **@getPrevX()** - Mengambil nilai dari sebelum x
      - **@getPrevY()** - Mengambil nilai dari sebelum Y 
      - **@setX()** - Memasukkan nilai X
      - **@setY()** - Memasukkan nilai Y
      - **@MoveUp()** - Bergerak keatas  
      - **@MoveDown()** - Bergerak kebawah 
      - **@MoveRight())** - Bergerak kekanan
      - **@MoveLeft()** - Bergerak kekiri
      - **@update()** - Mengupadate block 

`Direction.java`
- Kelas Enum penentu arah gerak uar
   - 1 Method
      - **@Direction()** - berisi 4 arah gerak (UP, DOWN, LEFT, RIGHT)

`Food.java`
- Kelas untuk menampilkan makanan ular
   - 4 Class Variable
      - **@x** - Koordinat X dari food
      - **@y** - Koordinat X dari food
      - **@foodSize** - Mengatur ukuran makanan
      - **@foodColor** - Mengatur warna makanan 
   - 4 Method
      - **@food()** - Berupa Construct dari class Food
      - **@setRandomColor()** - Set warna ular
      - **@getPosX()** - Mengambil nilai dari posisi X
      - **@getPosY()** - Mengambil nilai dari posisi Y
   
`GameField.java`
- Kelas untuk menampilkan field dari game
   - 6 Class Variable
      - **@width** - Mengatur lebar field
      - **@height** - Mengatur tinggi field
      - **@food** - Mengambil method yang ada di class Food 
      - **@blocks** - Menyimpan blok 
      - **@snake** - Mengambil method snake
      - **@score** - Mengambil method score
   - 13 Method
      - **@GameField()** - Berupa Construct dari class GameField
      - **@addBlock()** - Menambah block 
      - **@addSnake()** - Menambah snake
      - **@getW()** - Mengambil nilai dari width
      - **@getH()** - Mengambil nilai dari Height
      - **@createFood()** - Membuat makanan ular
      - **@update()** - Update Gamefield
      - **@creteTailBlock()** - Menambahkan block di ekor ular
      - **@getSnake()** - Mengambil nilai dari snake
      - **@isEaten()** - Kondisi apakah makanan sudah dimakan atau belum
      - **@isGameOver()** - kondisi apakah game sudah berakhir atau belum
      - **@reset()** - Untuk reset game
      - **@score()** - Menampilkan score

`Score.java`
- Kelas yang mengatur Score game
   - 3 Class Variable
      - **@point** - point user game
      - **@rank** - ranking user game
      - **@name** - nama user game

   - 9 Method
      - **@Score()** - Berupa Construct dari class Score
      - **@setName()** - Memasukkan nama user
      - **@getName()** - Mengambil nilai dari nama user
      - **@getpoint()** - Mengambil nilai dari point
      - **@addPoint()** - Menambah point ke scoreboard
      - **@resetPoint()** - Mereset point
      - **@saveToScoreboard()** - Menyimpan nilai ke scoreboard
      - **@sortScoreboard()** - Mengurutkan point ke scoreboard
      - **@readScoreboard()** - Membaca point di file CSV

`Snake.java`
- Kelas ular
   - 6 Class Variable
      - **@snakeLength** - Panjang ular
      - **@body** - Badan ular
      - **@head** - Kepala ular
      - **@tail** - Ekor ular
      - **@gameField** - Area bermain ular
      - **@direction** - Arah ular
   - 8 Method
      - **@Snake()** - Berupa Construct dari class Snake
      - **@getBody()** - Mengambil nilai badan ular
      - **@getHead()** - Mengambil nilai Kepala ular
      - **@getTail()** - Mengambil nilai ekor ular
      - **@getDirection()** - Mengambil nilai input   arah ular
      - **@setHead()** - Setter Kepala ular
      - **@setTail()** - Setter Kepala ekor
      - **@setDirection()** - Setter arah

![UML](/uml/umlular.jpg "UML")

## Notable Assumption and Design App Details

   - Program memiliki ukuran frame 100 x 100
   - Warna ular, dan area permainan telah diatur dengan ketentuan yang telah ditetapkan
   - Terdapat foto creator dan foto snake pada interface awal
   - Warna food berubah rubah secara random
   - Perolehan skor akan bertambah sebanyak 1 setiap ular memakan buah
   - Terdapat menu untuk menampilkan pilihan memulai permainan, ubah level permainan (easy, medium, hard, very hard, crazy), leaderboard skor pemain
   - Tombol-tombol yang digunakan adalah arrow keys  dan mouse untuk navigasi pada menu
   - Ular berukuran awal 4 sel akan muncul ditengah area permainan dengan menghadap ke kiri 
   - Buah berukuran 1 sel akan muncul pada area secara random dengan aturan yang sudah ditetapkan
   - Jika Ular menyentuh setiap batas frame, maka permainan dinyatakan selesai
   - Jika Ular menyentuh tubuhnya sendiri, maka permainan juga dinyatakan selesai
   - Saat permainan awal, program akan meminta nama dari user sesuai skor yang didapat
   - Saat permainan selesai, bisa memulai ulang game dengan menekan enter
   - Skor yang telah didapat setiap pemain dapat dilihat pada menu leaderboard dan didapatkan dengan menekan tombol scoreboard
   - Menekan tombol Scoreboard membuat game dipause, dan saat menekan back harus menekan spasi terlebih dahulu untuk melanjutkan game 
   - Bila ingin menyimpan data-data pada leaderboard, pilih enter atau spasi saat keluar dari program dan data tersimpan otomatis