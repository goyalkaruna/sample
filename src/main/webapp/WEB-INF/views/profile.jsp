<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>


<form action="results" id="ProfileForm" method="post" >

<table border="0" cellpadding="5" cellspacing="0" width="600">
<tr>
<td><b>ID*:</b></td>
<td><input id="id" name="id" type="text" maxlength="60" style="width:300px; border:1px solid #999999" /></td>
</tr>
<tr>
<td><b>First, Last Name*:</b></td>
<td>
<input id="firstname" name="firstname" type="text" maxlength="60" style="width:146px; border:1px solid #999999" />
<input id="lastname" name="lastname" type="text" maxlength="60" style="width:146px; border:1px solid #999999" />
</td>
</tr>
<tr>
<td><b>Email address*:</b></td>
<td><input id="email" name="email" type="text" maxlength="60" style="width:300px; border:1px solid #999999" /></td>
</tr>
<tr>
<td><b>Address*:</b></td>
<td><input id="address" name="address" type="text" maxlength="100" style="width:300px; border:1px solid #999999" /></td>
</tr>
<tr>
<td><b>Organization*:</b></td>
<td><input id="organization" name="organization" type="text" maxlength="60" style="width:300px; border:1px solid #999999" /></td>
</tr>
<tr>
<td><b>About Myself*:</b></td>
<td><input id="aboutMyself" name="aboutMyself" type="text" maxlength="300" style="width:300px; border:1px solid #999999" /></td>
</tr>
<tr>
<td colspan="2" align="center">
<br />
<table border="0" cellpadding="0" cellspacing="0">

</table>
<br/>
* - required fields. &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;

<input id="Create" name="Create" type="submit" value="Submit" />
</td>
</tr>
</table>
<br/>
</form>
</body>
</html>