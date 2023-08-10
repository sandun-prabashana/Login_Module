


$(document).ready(function() {
    var str = $(".mvl-message").text().trim().length;
    var width_window = $(window).width();
    if (str == 0) {
        if (Number(width_window) < 550) {
            $("#footer1").removeClass("mvl-footer1");
            $("#footer1").addClass("mvl-footer1-m");
            $("#footer2").removeClass("mvl-footer2-m");
            $("#footer2").addClass("mvl-footer2-m");
            // slide QR
            $(".mvl-sec1").click(function() {
                $(".mvl-sec1").animate({
                    "width": '0%'
                }, 500);
                $(".mvl-sec1").css({
                    "background-image": 'url(/<%=request.getContextPath()%>/resources/assets/image/mvisa.svg)'
                });

                setTimeout(function() {
                    $(".mvl-sec2").fadeIn(100);
                    $(".mvl-sec2").css({
                        "display": 'table'
                    });
                    $(".mvl-sec1").css({
                        "cursor": 'auto',
                        "pointer-events": 'none'
                    });
                }, 300);
                setTimeout(function() {
                    $(".mvl-sec2").animate({
                        "width": '100%'
                    }, 350);
                    $(".mvl-footer1").animate({
                        "right": '100%'
                    }, 350);
                    $(".mvl-footer2").animate({
                        "right": '100%'
                    }, 350);
                }, 200);
            });


        } else {
            // slide QR
            $(".mvl-sec1").click(function() {
                $(".mvl-sec1").animate({
                    "width": '50%'
                }, 500);
                $(".mvl-sec1").css({
                    "background-image": 'url(/<%=request.getContextPath()%>/resources/assets/image/mvisa.svg)'
                });

                setTimeout(function() {
                    $(".mvl-sec2").fadeIn(100);
                    $(".mvl-sec2").css({
                        "display": 'table'
                    });
                    $(".mvl-sec1").css({
                        "cursor": 'auto',
                        "pointer-events": 'none'
                    });
                }, 300);
                setTimeout(function() {
                    $(".mvl-sec2").animate({
                        "width": '50%'
                    }, 350);
                    $(".mvl-footer1").animate({
                        "right": '50%'
                    }, 350);
                    $(".mvl-footer2").animate({
                        "right": '50%'
                    }, 350);
                }, 200);
            });
        }
    } else {

        if (Number(width_window) < 550) {
            $("#footer1").removeClass("mvl-footer1");
            $("#footer1").addClass("mvl-footer1-m");
            $("#footer2").removeClass("mvl-footer2-m");
            $("#footer2").addClass("mvl-footer2-m");
            $(".mvl-sec1").css({
                "width": '0%'
            }, 0);
            $(".mvl-sec1").css({
                "background-image": 'url(/<%=request.getContextPath()%>/resources/assets/image/mvisa.svg)'
            });

            $(".mvl-sec2").css({
                "display": 'table'
            });
            $(".mvl-sec1").css({
                "cursor": 'auto',
                "pointer-events": 'none'
            });


            $(".mvl-sec2").css({
                "width": '100%'
            }, 0);
            $(".mvl-footer1").css({
                "right": '100%'
            }, 0);
            $(".mvl-footer2").css({
                "right": '100%'
            }, 0);
        } else {
            $(".mvl-sec1").css({
                "width": '50%'
            }, 0);
            $(".mvl-sec1").css({
                "background-image": 'url(/<%=request.getContextPath()%>/resources/assets/image/mvisa.svg)'
            });

            $(".mvl-sec2").css({
                "display": 'table'
            });
            $(".mvl-sec1").css({
                "cursor": 'auto',
                "pointer-events": 'none'
            });


            $(".mvl-sec2").css({
                "width": '50%'
            }, 0);
            $(".mvl-footer1").css({
                "right": '50%'
            }, 0);
            $(".mvl-footer2").css({
                "right": '50%'
            }, 0);
        }



    }

    // login button
    $(".mvl-loginbut > button").hover(function() {
        setTimeout(function() {
            $(".mvl-loginbut > button > i").animate({
                opacity: '1',
                color: 'black'
            }, 100);
        }, 200);

    });
    $(".mvl-loginbut > button").mouseleave(function() {
        setTimeout(function() {
            $(".mvl-loginbut > button > i").animate({
                opacity: '0'
            }, 100);
        }, 200);
    });

    // reload section set li & a
    var link_li = window.localStorage.getItem('link');
    $('#' + link_li).addClass('active');
    $('#' + link_li).addClass('selected');

    // save section
    $("ul.sub-links > li").click(function() {
        var url = $(this)[0].childNodes[0].attributes.href.nodeValue;
        window.localStorage.setItem('link', $(this)[0].id);
        window.location = url;
    });
    $("ul.sub-links > li > a").click(function() {
        var url = $(this)[0].parentNode.attributes.id.nodeValue;
        window.localStorage.setItem('link', url);
    });

    // scroll set
    var scroll = window.localStorage.getItem("scroll");
    $(".sidebar-left-collapse").scrollTop(scroll);

    // scroll save
    var scroll;
    $(".sidebar-left-collapse").scroll(function() {
        scroll = $(".sidebar-left-collapse").scrollTop();
        window.localStorage.setItem('scroll', scroll);
    });

});

