<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dima
  Date: 1/11/16
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/home.css"/>">
    <script type="text/javascript" src="/js/home.js"></script>
</head>
<body>
<div class = "main">
    <div class="home-block" style="height: 680px;">
        <div class="social-buttons">
            <a class="facebook" href="https://www.facebook.com/" target="_blank">
            </a>
            <a class="linkedin" href="https://www.linkedin.com/nhome/" target="_blank">
            </a>
            <span class="border"></span>
            <a class="twitter" href="http://twitter.com/coloured_lines" target="_blank">
            </a>
        </div>

        <div class="home-content">
            <br>
            <h2 class="text-logo">Сервіс<br>для моніторингу<br> тереторій заселення<br>за демографічними <br>та екологічними критеріями</h2>
            <!-- 	<img src="http://www.colouredlines.com.au/wp-content/themes/colouredlines/images/logo-coloured_lines.png" width="266" height="50"><br><br><br> -->
            <p>Welcome to Service for monitoring!!!</p>
            <p>You can view statistics on environmental and demographic criteria to choose the best location of the house.</p>
            <a href="https://vk.com/id171488959" target="_blank" style="color: #58585a; font-size: 13px;  text-decoration: none; vertical-align: middle;">Web design by <img src="/image/univ.jpg" class="hov-myna" alt="Web design by Myna" width="20" h style="width: 40px !important; margin-left: 5px; padding-top:2px;"></a>
        </div>
    </div>

    <div class="circle" style="height: 680px;">
        <img src="/image/circle2.svg" style="display: block; height: 100%" alt="">
    </div>

    <div class="colours tk-museo-sans" style="height: 680px;">
        <a href="#map" class="colour_link" data-current="false"><span data-colour="#f2b701"  class="colour map" style=" padding-top: 0px; margin-top: 0px; margin-left: 0px; background-color:rgb(242, 183, 1);"><span>MAP</span></span>
        </a>

        <a href="#" class="colour_link" data-current="false"><span data-colour="#e57d04"  class="colour" style=" background-color: rgb(229, 125, 4);"><span>USER SETTINGS</span></span>
        </a>

        <a href="#" class="colour_link " data-current="false"><span data-colour="#dc0030"  class="colour" style=" padding-top: 0px; margin-top: 0px; margin-left: 0px; background-color:rgb(177, 0, 88);"><span>STATISTICS</span></span>
        </a>

        <a href="#" class="colour_link" data-current="false"><span data-colour="#b10058"  class="colour" style=" padding-top: 0px; margin-top: 0px; margin-left: 0px; background-color: rgb(124, 55, 138);"><span>COMPARISON</span></span>
        </a>

        <a href="#faq" class="colour_link"  data-current="false"><span data-colour="#7c378a"   class="colour faq" style=" background-color:rgb(52, 101, 170);"><span>FAQs</span></span>
        </a>

        <%--<a href="http://colouredlines.com.au/faqs/" class="colour_link faqs" data-current="false"><span data-colour="#68778a" data-name="faqs" class="colour" style="background-color:rgb(9, 162, 117);"><span></span></span>--%>
        <%--</a>--%>

        <%--<a href="http://colouredlines.com.au/home/contact-us/" class="colour_link contact_us" data-current="false"><span data-colour="#09a275" data-name="contact_us" class="colour" style=" background-color: #b0bbb4;"><span>Contact Us</span></span>--%>
        <%--</a>--%>

        <%--<a href="http://colouredlines.com.au/blog/" class="colour_link blog" data-current="false"><span data-colour="#7cb854" data-name="blog" class="colour" style=" background-color:#546171;"><span>Blog</span></span>--%>
        <%--</a>--%>
    </div>
</div>
</div>
<div class="content-panel">
    <div class="content-box"></div>
</div>
</body>
</html>
