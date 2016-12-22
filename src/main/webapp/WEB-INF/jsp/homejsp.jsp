<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta name="description" content="">
            <meta name="author" content="">
            <title>Main de bridge</title>
            <!-- Bootstrap Core CSS -->
            <link href="resources/bootstrap-3.3.6/css/bootstrap.min.css" rel="stylesheet">
            <!-- Custom CSS -->
            <link href="resources/bootstrap-3.3.6/css/simple-sidebar.css" rel="stylesheet">
            <link href="resources/css/jouerbridge.css" rel="stylesheet">
            <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
        </head>

        <body>
            <div id="wrapper">
                <!-- Sidebar -->
                <div id="sidebar-wrapper">
                    <ul class="sidebar-nav">
                        <li class="sidebar-brand"><a href="#"> Titre menu </a></li>
                        <li><a href="#">menu 1</a></li>
                    </ul>
                </div>
                <!-- /#sidebar-wrapper -->
                <!-- Page Content -->
                <div id="page-content-wrapper">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12">
                                <h1>Main de bridge</h1>
                                <h2>Temps actuel: ${serverTime}.</h2>

                                <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle
                     Menu</a>
                            </div>
                        </div>
                    </div>
                </div>

                <!--                                 <a href="#" class="btn btn-default btn-carte" role="button"><span class="pull-left">A</span></a> -->
                <!--          /#page-content-wrapper -->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="NP" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="NC" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="NK" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="NT" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                    <div class="row">
                        <div id="OP" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div id="N-1" class="col-sm-1"></div>
                        <div id="N" class="col-sm-1"></div>
                        <div id="N+1" class="col-sm-1"></div>
                        <div id="N+2" class="col-sm-1"></div>
                        <div id="EP" class="col-sm-4" style="background-color: lightgray;"></div>
                    </div>
                    <div class="row">
                        <div id="OC" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div id="O" class="col-sm-1"></div>
                        <div id="O+1" class="col-sm-1"></div>
                        <div id="O+2" class="col-sm-1"></div>
                        <div id="O+3" class="col-sm-1"></div>
                        <div id="EC" class="col-sm-4" style="background-color: lightgray;"></div>
                    </div>
                    <div class="row">
                        <div id="OK" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div id="E-3" class="col-sm-1"></div>
                        <div id="E-2" class="col-sm-1"></div>
                        <div id="E-1" class="col-sm-1"></div>
                        <div id="E" class="col-sm-1"></div>
                        <div id="EK" class="col-sm-4" style="background-color: lightgray;"></div>
                    </div>
                    <div class="row">
                        <div id="OT" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div id="S-2" class="col-sm-1"></div>
                        <div id="S-1" class="col-sm-1"></div>
                        <div id="S" class="col-sm-1"></div>
                        <div id="S+1" class="col-sm-1"></div>
                        <div id="ET" class="col-sm-4" style="background-color: lightgray;"></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="SP" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="SC" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="SK" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4"></div>
                        <div id="ST" class="col-sm-4" style="background-color: lightgray;"></div>
                        <div class="col-sm-4"></div>
                    </div>
                </div>

            </div>
            <!-- /#wrapper -->


            <div>
                <!-- Recup variable du controller dans variable cachees (hidden) -->
                <input id="mSudId" type="hidden" value="${mainVue.mainSud}" name="mSudVar" />
                <input id="mOuestId" type="hidden" value="${mainVue.mainOuest}" name="mOuestVar" />
                <input id="mNordId" type="hidden" value="${mainVue.mainNord}" name="mNordVar" />
                <input id="mEstId" type="hidden" value="${mainVue.mainEst}" name="mEstVar" />
                <input id="mSudIdCarte" type="hidden" value="${mainVue.carteSud}" name="mSudIdCarte" />
                <input id="mOuestIdCarte" type="hidden" value="${mainVue.carteOuest}" name="mOuestVarCarte" />
                <input id="mNordIdCarte" type="hidden" value="${mainVue.carteNord}" name="mNordVarCarte" />
                <input id="mEstIdCarte" type="hidden" value="${mainVue.carteEst}" name="mEstVarCarte" />
            </div>



            <!-- jQuery -->
            <script src="resources/jquery-2.2.0/jquery-2.2.0.min.js"></script>
            <!-- Bootstrap Core JavaScript -->
            <script src="resources/bootstrap-3.3.6/js/bootstrap.min.js"></script>
            <!-- Script maison-->
            <script src="/resources/js/jouerbridge.js" /></script>
        </body>

        </html>