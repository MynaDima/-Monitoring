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
    <div class="home-block" style="height: 700px;">
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
            <h2 class="text-logo">Сервіс<br>для моніторингу.<br></h2>
            <!-- 	<img src="http://www.colouredlines.com.au/wp-content/themes/colouredlines/images/logo-coloured_lines.png" width="266" height="50"><br><br><br> -->
            <p>Welcome to Coloured Lines… a new breed of business-grade VoIP carrier.</p>
            <p>Here to challenge the status quo when it comes to telephony, Coloured Lines is a new breed of full service VOIP carrier offering affordable voice and data communication over a business grade, private network.</p>

            <br>
            <a href="https://vk.com/id171488959" target="_blank" style="color: #58585a; font-size: 13px;  text-decoration: none; vertical-align: middle;">Web design by <img src="/image/univ.jpg" class="hov-myna" alt="Web design by Myna" width="20" h style="width: 40px !important; margin-left: 5px; padding-top:2px;"></a>
        </div>
    </div>

    <div class="circle" style="height: 700px;">
        <img src="/image/circle2.svg" style="display: block; height: 100%" alt="">
    </div>


    <div class="colours tk-museo-sans" style="height: 700px;">
        <a href="#faq" class="colour_link faq" data-current="false"><span data-colour="#f2b701" data-name="who_we_are" class="colour map" style="height: 87px; padding-top: 0px; margin-top: 0px; margin-left: 0px; background-color:#231b19;"><span>Map</span></span>
        </a>

        <a href="#" class="colour_link what_we_do" data-current="false"><span data-colour="#e57d04" data-name="what_we_do" class="colour" style="height: 87px; background-color: #cc392b;"><span>What We Do</span></span>
        </a>

        <a href="http://colouredlines.com.au/why-choose-us/" class="colour_link why_choose_us" data-current="false"><span data-colour="#dc0030" data-name="why_choose_us" class="colour" style="height: 87px; padding-top: 0px; margin-top: 0px; margin-left: 0px; background-color:#de5200;"><span>Why Choose Us</span></span>
        </a>

        <a href="http://colouredlines.com.au/products/" class="colour_link products" data-current="false"><span data-colour="#b10058" data-name="products" class="colour" style="height: 87px; padding-top: 0px; margin-top: 0px; margin-left: 0px; background-color: #ff9d2d;"><span>Products</span></span>
        </a>

        <a href="http://colouredlines.com.au/testimonials/" class="colour_link guestbook" data-current="false"><span data-colour="#7c378a" data-name="guestbook" class="colour" style="height: 87px; background-color:#fedc18;"><span>Testimonials</span></span>
        </a>

        <a href="http://colouredlines.com.au/faqs/" class="colour_link faqs" data-current="false"><span data-colour="#68778a" data-name="faqs" class="colour" style="height: 87px; background-color:#3f414a;"><span>FAQs</span></span>
        </a>

        <a href="http://colouredlines.com.au/home/contact-us/" class="colour_link contact_us" data-current="false"><span data-colour="#09a275" data-name="contact_us" class="colour" style="height: 87px; background-color: #3f0603;"><span>Contact Us</span></span>
        </a>

        <a href="http://colouredlines.com.au/blog/" class="colour_link blog" data-current="false"><span data-colour="#7cb854" data-name="blog" class="colour" style="height: 91px; background-color:#f56548;"><span>Blog</span></span>
        </a>
    </div>
</div>
</div>
<div class="content-panel">
    <div class="content-box"></div>
</div>
</body>
</html>
