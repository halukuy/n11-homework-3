


markdown
Copy code
# Spring Boot Weather API Project

Bu proje, Spring Boot kullanarak basit bir hava durumu servisi sağlamak için oluşturulmuştur.

## Proje Tanımı

Bu proje, OpenWeatherMap API kullanarak verilen bir ülke ve şehir için hava durumu bilgisini çekmektedir. Proje, Spring Boot, Spring Web ve RestTemplate gibi temel Spring framework bileşenlerini içermektedir.

## Proje Yapısı

Proje, aşağıdaki ana paket ve sınıfları içermektedir:

- **com.example.halukuyumsal.n11homework3.WeatherController:** Hava durumu bilgisini sunan RESTful API'yi yönetir.
- **com.example.halukuyumsal.n11homework3.WeatherService:** Hava durumu servisini temsil eder ve OpenWeatherMap API ile iletişim kurar.
- **com.example.halukuyumsal.n11homework3.WeatherServiceException:** Özel hava durumu istisna sınıfıdır.
  
## Projeyi Çalıştırma

Proje, Spring Boot ile geliştirildiği için aşağıdaki adımları izleyerek kolayca çalıştırabilirsiniz:

1. Proje dizinine gidin: `cd n11homework3`
2. Projeyi derleyin: `mvn clean install`
3. Uygulamayı başlatın: `mvn spring-boot:run`

Uygulama başarıyla başlatıldığında, tarayıcınızda [http://localhost:8080/getWeather?country=Turkey&city=Istanbul](http://localhost:8080/getWeather?country=Turkey&city=Istanbul) adresine giderek hava durumu bilgisini görebilirsiniz.

## Yapılandırma

Proje, `src/main/resources/application.properties` dosyasında aşağıdaki konfigürasyonları içermektedir:

- `weather.api.key`: OpenWeatherMap API key'i
- `weather.api.url`: OpenWeatherMap API endpoint URL'i

Bu değerleri OpenWeatherMap API hesabınızın bilgileriyle güncellemeniz gerekmektedir.
