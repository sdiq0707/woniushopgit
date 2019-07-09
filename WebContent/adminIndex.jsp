<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		
		<script>
			$(document).ready(function(){
				//alert("${pageContext.request.contextPath}");
				$("#addRole").click(function(){
					location.href="jsp/roleAdd.jsp";
				});
				$(".softDelBtn").click(function(){
					location.href="role.action?method=softDel&rid="+$(this).val();
				});
				$(".editBtn").click(function(){
					location.href="role.action?method=getRole&rid="+$(this).val();
				});
				$(".delBtn").click(function(){
					var sel = window.confirm("是否删除？");
					if(sel){
						location.href="role.action?method=delRole&rid="+$(this).val();
					}
				});
			});
		</script>
	</head>
	<body>
		<nav class="navbar navbar-default" style="margin: 0px;">
			<div class="col-md-10 ">
				<span class="lable lable-info h3" style="height: 50px; line-height: 50px;">
					WoniuShop管理系统
				</span>
			</div>
		</nav>
			<div class="col-md-2 row" style="margin: 0px;">
				<ul class="nav nav-tabs nav-stacked">
					<li><a href="role.action">角色管理</a></li>
					<li><a href="type.action">类型管理</a></li>
					<li><a href="goods.action">商品管理</a></li>
				</ul>
			</div>
			<div class="col-md-10 bg-info" style="height: 500px;">
				<table  class="col-md-10 table table-bordered table-hover table-striped" style="height: 400px;">
					<tr  class="text-center">
						<td>序号</td>
						<td>角色名称</td>
						<td>软删除</td>
						<td>编辑</td>
						<td>删除</td>
					</tr>
					<c:forEach items="${roles }" var="role" varStatus="i">
						<tr class="text-center">
							<td>${(pb.pageNum-1)*pb.pageRow+i.index+1 }</td>
							<td>${role.rname }</td>
							<td><button class="softDelBtn" value="${role.rid }">${role.rdel==1?"可 用":"不可用" }</button></td>
							<td><button class="editBtn" value="${role.rid }">编辑</button></td>
							<td><button class="delBtn" value="${role.rid }">删除</button></td>
						</tr>
					</c:forEach>
					<tr>
						<th colspan="5" class="text-center">
							<a href="role.action?pageNum=1">首页</a>
							<a href="role.action?pageNum=${pb.pageNum==1?1:pb.pageNum-1 }">上一页</a>
							${pb.pageNum }/${pb.countPage}
							<a href="role.action?pageNum=${pb.pageNum==pb.countPage?pb.countPage:pb.pageNum+1 }">下一页</a>
							<a href="role.action?pageNum=${pb.countPage }">末页</a>
							<button id="addRole" type="button" class="btn btn-info">添加角色</button>
						</th>
					</tr>
				</table>
			</div>
					
		<nav class="navbar navbar-default navbar-fixed-bottom text-center">
			<h3>&copy;蜗牛学院版权所有</h3>
		</nav>
	</body>
</html>
