# javaClient

javaClient 프로젝트는 다른 Repository 에 있는 javaAPI 프로젝트와 연결되는 프로젝트입니다.

javaClient 프로젝트는 Spring Boot ( MVC ) 로 구현하였으며, javaAPI ( API Server ) 에 공공데이터 포털의 코로나19 접종현황 데이터를 요청합니다.
이후, javaAPI ( API Server ) 로 부터 전달 받은 데이터를 화면에 노출해줍니다.
( javaAPI 는 실질적으로 API 를 호출하고 데이터를 javaClient 에 전달해줍니다. )
