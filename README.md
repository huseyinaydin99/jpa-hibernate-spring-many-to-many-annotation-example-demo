# JPA-ManyToMany / Çoğa çok ilişki.!

Create Student with course REQUEST / Öğrenci ve aldığı kurslar.

```
curl --location --request POST 'http://localhost:9191/student/course' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "santosh",
    "age": 33,
    "dept": "UI",
    "courses": [
        {
            "title": "Angular",
            "abbreviation": "ng",
            "modules": 12,
            "fee": 5000
        },
        {
            "title": "React JS",
            "abbreviation": "RJS",
            "modules": 11,
            "fee": 1600
        }
    ]
}'
```

payload 2:
```
{
    "name": "Hüseyin",
    "age": 28,
    "dept": "DEV",
    "courses": [
        {
            "title": "Machine Learning",
            "abbreviation": "ML",
            "modules": 10,
            "fee": 4000
        },
        {
            "title": "Spring Boot",
            "abbreviation": "SB",
            "modules": 11,
            "fee": 2500
        },
        {
            "title": "Database Systems",
            "abbreviation": "DS",
            "modules": 5,
            "fee": 1800
        }
    ]
}

```
Fetch students with course
Bütün öğrencileri ve kurslarını çek.!

```
curl --location --request GET 'http://localhost:9191/student/course' \
--data-raw ''
```
