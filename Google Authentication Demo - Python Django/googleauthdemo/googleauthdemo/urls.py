from django.contrib import admin
from django.urls import path, include
from core.views import hello
from django.contrib.auth import views as auth_views

urlpatterns = [
    path('admin/', admin.site.urls),
    
    # 👇 This is the homepage route
    path('', hello, name='hello'),

    # Auth routes
    path('login/', auth_views.LoginView.as_view(template_name='registration/login.html'), name='login'),
    path('logout/', auth_views.LogoutView.as_view(), name='logout'),

    # Social auth
    path('auth/', include('social_django.urls', namespace='social')),
]
