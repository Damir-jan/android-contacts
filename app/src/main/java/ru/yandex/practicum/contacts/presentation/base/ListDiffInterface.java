package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    public boolean theSameAs(T argument);

    public boolean equals(Object argument);
}
