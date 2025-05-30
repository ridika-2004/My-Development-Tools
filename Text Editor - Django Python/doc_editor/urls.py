from django.contrib import admin
from django.urls import path
from editor import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', views.editor, name='editor'),
]