from django.urls import path
from . import views

urlpatterns = [
    path("", views.post_list, name="post_list"),
    path("add/", views.add_post, name="add_post"),
]