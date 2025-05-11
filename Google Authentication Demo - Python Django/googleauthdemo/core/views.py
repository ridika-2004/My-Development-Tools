from django.contrib.auth.decorators import login_required
from django.shortcuts import render

@login_required
def hello(request):
    return render(request, 'core/hello.html')
