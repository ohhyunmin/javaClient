<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body style="padding: 15px;">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" id="a_reload" href="" style="font-weight:bold">SIMPLE API PROJECT</a>
	    <div class="collapse navbar-collapse" id="navbarNav">
	      <ul class="navbar-nav">
	        <li class="nav-item">
	          <a class="nav-link" href="/Vacc_Total_Stat/list" style="font-weight:bold">코로나 접종현황</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
	<div style="padding:15px;">
		<h3 style="font-weight:bold">시도별 접종 현황표</h3>
	</div>
	<div>
		<table class="table table-secondary table-striped" id="" style="width:100">
	        <colgroup>
	            <col style="width:10%;">
	            <col style="width:10%;">
	            <col style="width:10%;">
	            <col style="width:10%;">
	            <col style="width:10%;">
	            <col style="width:10%;">
	            <col style="width:10%;">
	        </colgroup>
	        <thead>
	        <tr>
	            <th scope="col" rowspan="2" class="sorting sorting_asc" style="text-align:center;vertical-align:middle">구분</th>
	            <th scope="col" colspan="2">1차접종</th>
	            <th scope="col" colspan="2">2차접종</th>
	            <th scope="col" colspan="2">3차접종</th>
	        </tr>
	        <tr>
	            <th scope="col">당일 실적</th>
	            <th scope="col">당일 누계</th>
	            <th scope="col">당일 실적</th>
	            <th scope="col">당일 누계</th>
	            <th scope="col">당일 실적</th>
	            <th scope="col">당일 누계</th>
	        </tr>
	        </thead>
	        <tbody>
            <c:forEach var="data" items="${vacc_Total_Stat.data}">
            	<tr class="sumline_cmn_top">
	                <th scope="row">${data.sido}</th>
	                <td class="d_num">
	                    
	                    ${data.firstCnt}
	                </td>
	                <td class="d_num">
	                    
	                    ${data.totalFirstCnt}
	                </td>
	                <td class="d_num">
	                    
	                    ${data.secondCnt}
	                </td>
	                <td class="d_num">
	                    
	                    ${data.totalSecondCnt}
	                </td>
	                <td class="d_num">
	                    
	                    ${data.thirdCnt}
	                </td>
	                <td class="d_num">
	                    
	                    ${data.totalThirdCnt}
	                </td>
	
	            </tr>
			</c:forEach>
	        </tbody>
	    </table>
	</div>
</body>
</html>
