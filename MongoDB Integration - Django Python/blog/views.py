from django.shortcuts import render, redirect
from .mongo_utils import posts_collection
from .models import Post

def post_list(request):
    posts = list(posts_collection.find().sort("created_at", -1))
    return render(request, "blog/post_list.html", {"posts": posts})

def add_post(request):
    if request.method == "POST":
        post = Post(
            title=request.POST.get("title"),
            content=request.POST.get("content"),
            author=request.POST.get("author"),
            tags=request.POST.get("tags", "").split(","),
        )
        posts_collection.insert_one(post.to_dict())
        return redirect("post_list")
    return render(request, "blog/add_post.html")